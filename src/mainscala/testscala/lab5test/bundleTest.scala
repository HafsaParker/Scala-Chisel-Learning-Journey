package lab5task
import org.scalatest._
import chiseltest._
import chisel3._
class bundleTest extends FreeSpec with ChiselScalatestTester{
    "bundle Test" in {
        test(new Adder(15.U)){c=>
        c.io.in1.poke(5.U)
        c.io.in2.poke(5.U)
        c.io.sel.poke(true.B)
        c.clock.step(20)
        c.io.out.expect(10.U)

        }
    }
}