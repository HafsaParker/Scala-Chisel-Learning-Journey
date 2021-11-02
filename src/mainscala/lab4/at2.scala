package lab4task
import chisel3._
import chisel3.util._
trait config{
    val XLEN = 32
    //data_type = UInt
     
}
class LM_IO_Interface_ImmdValGen extends Bundle with config{
    val instr= Input (UInt(XLEN.W))
    val immd_se = Output(UInt(XLEN.W))
}
class ImmdValGen extends Module {

    val io = IO(new LM_IO_Interface_ImmdValGen)
    val opcode = io.instr(6,0)
    io.immd_se := 0.U
    switch(opcode){
        is ("b0010011".U){  //I
        
            io.immd_se := io.instr(31,20)
        }
        is ("b0100011".U){ //s
            io.immd_se := Cat(io.instr(31,25),io.instr(11,7))
        }
        is ("b0110111".U){  //U
            io.immd_se := io.instr(31,12)

        }
        is ("b1100011".U){ //SB
            io.immd_se := Cat(io.instr(31),io.instr(7),io.instr(30,25),io.instr(11,8),0.U)
        }
        is ("b1101111".U){
            io.immd_se := Cat(io.instr(31),io.instr(19,12),io.instr(20),io.instr(30,21),0.U)
        }
    }
}