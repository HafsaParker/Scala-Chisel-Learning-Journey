package lab6task
import chisel3._
class ex1 ( val init : Int = 1) extends Module {


    val io = IO ( new Bundle {
    val in = Input (UInt(4.W))
    val reload = Input(Bool())
    val out = Output ( UInt (4.W))

    })
    when (io.reload){
        val state = RegInit (init.U(4.W))
        val nextState = ( state << 1) | 0.U
        state := nextState
        io.out := state

    }.otherwise{
        io.out := io.in
    }
    

    
}