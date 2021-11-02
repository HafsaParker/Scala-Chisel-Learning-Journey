package lab7task
import chisel3._
import chisel3.util._
class ex1 extends Module{
    val io = IO(new Bundle{
        val in = Flipped(Decoupled(UInt(8.W)))
        val consumer = Decoupled(UInt(8.W))
    })
    io.in.ready := true.B
    val q1 = Queue(io.in, 8)
    val q2 = Queue(io.in, 8)
    val arbiter = Module(new Arbiter(UInt(),2))
    
    arbiter.io.in(0).valid:=1.B
    arbiter.io.in(1).valid:=1.B
    arbiter.io.in(0).bits:=q1.deq()
    arbiter.io.in(1).bits:=q2.deq()
    io.consumer <> arbiter.io.out
    //io.consumer.valid:=true.B
}

