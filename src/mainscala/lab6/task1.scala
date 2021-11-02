package lab6task
import chisel3._
import chisel3.util._
class counter_with_xor ( val max : Int = 4) extends Module {
    val io = IO ( new Bundle {
        val out = Output(UInt((log2Ceil (max).W)))
    })
    val counter = RegInit(0.U(log2Ceil(max).W))
    // val MSB_check  = counter(3.U)^1.B
    // val countt = Mux(MSB_check,0.U,counter+1.U)
    // counter := countt
    when(counter(1) ^ 0.B){
        counter := 0.U
    }.otherwise{
        counter := counter + 1.U
    }
    io.out := counter
}