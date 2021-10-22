package lab3task
import org.scalatest._
import chiseltest._
import chisel3._
class task32Test extends FreeSpec with ChiselScalatestTester{
    "task32 Test" in {
        test(new ALU()){ c=>
        c.io.in_A.poke(5.U)
        c.io.in_B.poke(2.U)
        c.io.alu_Op.poke(6.U)
        c.clock.step(20)
        c.io.out.expect(20.U)
        c.io.sum.expect(0.U)


        }
    }
}