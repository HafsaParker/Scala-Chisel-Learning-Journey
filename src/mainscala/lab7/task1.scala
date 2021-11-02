package lab7task
import chisel3._
import chisel3.util._
class Queue extends Module{
    val io =IO(new Bundle{
        val in = Input(Vec(4,UInt(4.W)))
        val out = Output(UInt(3.W))
    })
    val concat = Cat(io.in(0),io.in(1),io.in(2),io.in(3))
    val s0 :: s1 :: s2 :: s3 :: s4 :: s5 :: Nil =Enum(6)
    val state = RegInit(s2)
    io.out :=0.U
    switch(state){
        is (s0){
            when(concat===BitPat("b10??")){
                state:=s1
                io.out := 0.U
            }.elsewhen(concat=== BitPat("b11??")){
                state:=s1
                io.out := 0.U
            }.elsewhen(concat=== BitPat("b01??")){
                state:=s5
                io.out:=0.U
            }.otherwise{
                state := s0
                io.out:= 0.U
            }
        }
        is(s1){
            when(concat===BitPat("b1???")){
                state:=s2
                io.out := 0.U
            }.elsewhen(concat===BitPat("b0?1?")){
                state:=s0
                io.out:=0.U
            }.otherwise{
                state:=s1
                io.out:=0.U
            }
        }
        is(s2){
            when(concat===BitPat("b1???")){
                state:=s3
                io.out:=3.U
            }.elsewhen(concat===BitPat("b0?1?")){
                state:=s2
                io.out:=3.U
            }.otherwise{
                state:=s2
                io.out:=3.U
            }
        }
        is(s3){
            state:=s0
            io.out:=0.U
        }
        is(s4){
            when(concat===BitPat("b?1??")){
                state:=s3
                io.out:=7.U
            }.elsewhen(concat===BitPat("b?0?1")){
                state:=s5
                io.out:=7.U
            }.otherwise{
                state:=s4
                io.out:=7.U
            }
        }
        is(s5){
            when(concat===BitPat("b?1??")){
                state:=s4
                io.out:=0.U
            }.elsewhen(concat===BitPat("b?0?1")){
                state:=s0
                io.out:=0.U
            }.otherwise{
                state:=s5
                io.out:=0.U
            }
        }

    }

}