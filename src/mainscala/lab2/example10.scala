package lab2task
import chisel3._
import chisel3.util._

class one_muxhot extends Module{
    val io = IO(new Bundle{
        val in0 = Input(Bool())
        val in1 = Input(Bool())
        val in2 = Input(Bool())
        val in3 = Input(Bool())
        val sel = Input(UInt())
        val out = Output(Bool())
        //val out2 = Output(Bool())

    })
    io.out := Mux1H (io.sel,Seq(io.in0,io.in1,io.in2,io.in3))
}