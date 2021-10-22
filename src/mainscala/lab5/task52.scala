package lab5task
import chisel3._
import chisel3.util._
class IO_inTerFace[T <: Data] (gen:T) extends Bundle {
    val out = Output (gen.cloneType)
    val in1 = Input(gen.cloneType)
    val in2 = Input (gen.cloneType)
    val sel = Input(Bool())
}
class mMux (size:UInt) extends Module{
    val io = IO(new IO_inTerFace(size))
    
    io.out := Mux(io.sel,io.in1,io.in2)

    }
    


    