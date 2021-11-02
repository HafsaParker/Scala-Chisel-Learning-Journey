package lab3task
import org.scalatest._
import chiseltest._
import chisel3._
class as1Test extends FreeSpec with ChiselScalatestTester{
    "as1 Test" in {
        test(new BranchControl()){c=>
            c.io.arg_x.poke(2.U)
            c.io.arg_y.poke(3.U)
            c.io.fnct3.poke(7.U)
            c.io.branch.poke(true.B)
            c.clock.step(20)
            c.io.br_taken.expect(false.B)

        }
    }

}