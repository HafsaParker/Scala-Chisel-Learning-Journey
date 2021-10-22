package lab4task
import chisel3._
import chisel3.util._
class LM_IO_Interface_BranchControl extends Bundle{
    val fnct3 = Input(UInt(3.W))
    val branch = Input(Bool())
    val arg_x = Input(UInt(32.W))
    val arg_y= Input(UInt(32.W))
    val br_taken = Output(Bool())
}
class BranchControl extends Module{
    val io = IO(new LM_IO_Interface_BranchControl)
    val beq = io.arg_x.asSInt === io.arg_y.asSInt
    val bne = ~(io.arg_x.asSInt === io.arg_y.asSInt)
    val blt = io.arg_x.asSInt < io.arg_y.asSInt
    val bge = io.arg_x.asSInt >= io.arg_y.asSInt
    val bltu = io.arg_x < io.arg_y
    val bgeu = io.arg_x >= io.arg_y




    io.br_taken := MuxCase(0.B,Array(
        (io.fnct3 === 0.U) -> Mux(io.branch, beq, 0.B),
        (io.fnct3 === 1.U) -> Mux(io.branch, bne, 0.B),
        (io.fnct3 === 4.U) -> Mux(io.branch, blt, 0.B),
        (io.fnct3 === 5.U) -> Mux(io.branch, bge, 0.B),
        (io.fnct3 === 6.U) -> Mux(io.branch, bltu, 0.B),
        (io.fnct3 === 7.U) -> Mux(io.branch, bgeu, 0.B)



    ))
    // when(io.branch){io.br_taken := br}
    // .otherwise(io.br_taken := ~br)
    
}