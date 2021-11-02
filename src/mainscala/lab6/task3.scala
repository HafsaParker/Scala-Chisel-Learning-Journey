package lab6task
import chisel3._
import chisel3.util._
class Shifter( val len : Int = 3) extends Module {
    val io = IO ( new Bundle {

        val out = Vec(len , Output(Bool()))  
        val load_in = Vec(len , Input(Bool()))
        val in = Input(Bool())
        val load = Input(Bool())

    })
    val reg = RegInit(0.U(len.W))
    for (i <-0 until len){
        when(io.load){
            val nextState = ( reg << 1) | io.in
            reg := nextState
            io.out(i) := reg(i)
        }.otherwise{
            io.out(i):=io.load_in(i)
            
        }
    }



}