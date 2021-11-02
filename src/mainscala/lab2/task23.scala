package lab2task
import chisel3._
import chisel3.util._
class encoder extends Module{
    val io = IO(new Bundle{
    
        val input = Input(UInt(4.W))
        val out = Output(UInt(2.W))
    

    })
    io.out := Mux1H (io.input,Seq(3.U,2.U,1.U,0.U))
}