package lab3task
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
    val beq = (io.arg_x.asSInt === io.arg_y.asSInt).asBool
    val bne = (io.arg_x.asSInt =/= io.arg_y.asSInt).asBool
    val blt = (io.arg_x.asSInt < io.arg_y.asSInt).asBool
    val bge = (io.arg_x.asSInt >= io.arg_y.asSInt).asBool
    val bltu = (io.arg_x < io.arg_y).asBool
    val bgeu = (io.arg_x >= io.arg_y).asBool




    io.br_taken := MuxCase(0.U,Array(
        (io.fnct3 === 0.U) -> beq,
        (io.fnct3 === 1.U) -> bne,
        (io.fnct3 === 4.U) -> blt,
        (io.fnct3 === 5.U) -> bge,
        (io.fnct3 === 6.U) -> bltu,
        (io.fnct3 === 7.U) -> bgeu



    ))
    
}