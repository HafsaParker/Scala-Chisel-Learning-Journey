package lab2task
import chisel3._
import chisel3.util._

class as1 extends Module{
    val io = IO(new Bundle{
        val s1 = Input(Bool())
        val s2 = Input(Bool())
        val s3 = Input(Bool())
        val out = Output(UInt(32.W))
    })
    val con = Cat(io.s3,io.s2,io.s1)
    io.out := MuxCase(false.B,Array(
        (con === "b000".U) -> 0.U,
        (con === "b001".U) -> 8.U,
        (con === "b010".U) -> 16.U,
        (con === "b011".U) -> 24.U,
        (con === BitPat("b1??")) -> 32.U,


    ))



}