package lab5task
import org.scalatest._
import chiseltest._
import chisel3._
class task52Test extends FreeSpec with ChiselScalatestTester{
    "task52 Test" in{
        test(new mMux(32.U)){c=>
        c.io.in1.poke(1.U)
        c.io.in2.poke(0.U)
        c.io.sel.poke(true.B)
        c.clock.step(20)
        c.io.out.expect(1.U)

        }
    }
}