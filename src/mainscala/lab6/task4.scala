package lab6task
import chisel3._
import chisel3.util._
class up_down_counter ( val max : Int = 10) extends Module {

    val io = IO ( new Bundle {

    val out = Output ( UInt(log2Ceil(max).W))
    val up_down = Input(Bool())
    })
    val Outputt =RegInit(0.U(log2Ceil(max).W))
    // val up_down = io.up_down
    when(io.up_down){
        Outputt := Mux(Outputt===max.U,0.U,Outputt+1.U)
    
        val COUNT = Outputt
        io.out := COUNT

        
    }.otherwise{
        Outputt := Mux(Outputt===0.U,max.U,Outputt-1.U)
        val Count= Outputt
        io.out := Count
    }
    //io.out := Count



}





// val updown_counter =RegInit(0.U(log2Ceil(max)))
// val value = Mux((up_down===1.B and updown_counter=/=max.U),updown_counter+1.U,updown_counter-1.U)
// updown_counter := value
// io.out := updown_counter
// }
// //up_down_counter