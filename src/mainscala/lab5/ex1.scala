package lab5task
import chisel3._
import chisel3.util._
class AAdder(Width:Int) extends Module {
    val io = IO(new Bundle{
        require(Width >= 0)
        val inp1 = Input(UInt(Width.W))
        val inp2 = Input(UInt(Width.W))
        val outt = Output(UInt(Width.W))
        


    })
    io.outt := io.inp1 +io.inp2
    

}