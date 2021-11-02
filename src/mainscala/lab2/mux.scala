package lab2task
import chisel3._

class Mux_2to1IO extends Bundle {
    val in_A = Input (UInt(32.W))
    val in_B = Input (UInt(32.W))
    val select = Input(Bool())
    val out = Output(UInt())
}
class Mux_2to1 extends Module{
    val io = IO(new Mux_2to1IO )
    io.out := Mux(io.select,io.in_A,io.in_B)
    
}