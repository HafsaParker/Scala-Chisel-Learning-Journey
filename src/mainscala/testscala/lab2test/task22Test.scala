package lab2task
import org.scalatest._
import chiseltest._
import chisel3._
class task22Test extends FreeSpec with ChiselScalatestTester{
    "task22 Test" in {
        test(new Task()){ c=>
        c.io.in0.poke(true.B)
        c.io.in1.poke(false.B)
        c.io.in2.poke(true.B)
        c.io.in3.poke(true.B)
        c.io.in4.poke(true.B)
        c.io.in5.poke(true.B)
        c.io.in6.poke(true.B)
        c.io.in7.poke(true.B)

        c.io.sel.poke("b001".U)
        c.clock.step(20)
        c.io.out.expect(true.B)

        }
    }
}