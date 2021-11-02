package lab2task
import chisel3._
import chisel3.util._

class mux_2to1IO extends Bundle {
    val in_A = Input (UInt(32.W))
    val in_B = Input (UInt(32.W))
    val select = Input(Bool())
    val out = Output(UInt())
}
class mux_2to1 extends Module{
    val io = IO(new mux_2to1IO )
    val sel_val = Fill(32,io.select)
    io.out := (io.in_B & sel_val)|(io.in_A &(~sel_val) )
    
}