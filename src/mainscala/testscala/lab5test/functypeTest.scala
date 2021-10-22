package lab5task
import org.scalatest._
import chiseltest._
import chisel3._
class functypeTest extends FreeSpec with ChiselScalatestTester{
    "functype Test" in{
        test(new eMux( SInt(2.W))){c=>
        c.io.in1.poke(1.S)
        c.io.in2.poke(0.S)
        c.io.sel.poke(true.B)
        c.clock.step(20)
        c.io.out.expect(1.S)

        }
    }
}