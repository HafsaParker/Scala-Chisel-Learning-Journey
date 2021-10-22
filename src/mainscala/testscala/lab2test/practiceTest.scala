package lab2task
import org.scalatest._
import chiseltest._
import chisel3._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation

class practiceTest extends FreeSpec with ChiselScalatestTester{
    "practice Test" in {
        test(new practice()){c=>
        c.io.in0.poke(false.B)
        c.io.in1.poke(false.B)
        c.io.in2.poke(true.B)
        c.io.in3.poke(false.B)
        c.io.in4.poke(false.B)
        c.io.in5.poke(false.B)
        c.io.in6.poke(false.B)
        c.io.in7.poke(false.B)
        c.io.sel.poke("b010".U)
        c.clock.step(30)
        c.io.out.expect(true.B)

            
        }
    }
}
  