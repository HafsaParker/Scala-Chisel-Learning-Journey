package lab5task
import org.scalatest._
import chiseltest._
import chisel3._
class ex1Test extends FreeSpec with ChiselScalatestTester{
    "ex1 Test" in {
        test(new AAdder(15)){c=>
        c.io.inp1.poke(10.U)
        c.io.inp2.poke(10.U)
        c.clock.step(20)
        c.io.outt.expect(20.U)
        
        }
    }
}