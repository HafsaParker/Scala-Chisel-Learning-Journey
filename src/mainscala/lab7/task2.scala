package lab7task
import chisel3._
import chisel3.util._
import chisel3.experimental.ChiselEnum
// import chisel3.experimental.{with Clock , with Reset , with Clock And Reset
// }
import chisel3.experimental.BundleLiterals._
class Manchester_Encoding extends Module{

    val io = IO(new Bundle {
        val in = Input(UInt(1.W))
        val start = Input(Bool())
        val out = Output(UInt(8.W))
       val flag = Output(UInt(1.W))
    })
    val s0 :: s1 :: Nil=Enum(2)
    val state =RegInit(s0)
    io.out :=0.U
    io.flag:=0.U
    switch(state){
        is(s0){
            when(io.start===1.B){
                when(io.in===1.U){
                    val nstate = (state<<1)|0.U
                    state:=nstate
                    io.out:=state
                    io.flag:=1.U
                    state:=s1

                    
                }
            }
        }
        is (s1){
            when(io.start===1.B){
                when(io.in===0.U){
                    val nstate = (state<<1)|1.U
                    state:=nstate
                    io.out:=state
                    io.flag:=1.U
                    state:=s0

                    
                }
            }

        }
    }


} 