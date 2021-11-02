package lab5task
import org.scalatest._
import chiseltest._
import chisel3._
class advancedpTest extends FreeSpec with ChiselScalatestTester{
    "advancedp Test" in {
        test(new Operator(2,UInt(16.W))((_&_))){c=>
        c.io.in(0).poke(1.U)
        c.io.in(1).poke(1.U)
        // c.io.in(2).poke(1.U)
        // c.io.in(3).poke(1.U)
        c.clock.step(20)
        c.io.out(0).expect(1.U)
        c.io.out(1).expect(1.U)


        }
    }
}