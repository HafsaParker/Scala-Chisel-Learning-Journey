package lab2task
import org.scalatest._
import chiseltest._
import chisel3._
class task12Test extends FreeSpec with ChiselScalatestTester{
    "task12 Test" in {
        test(new mux_2to1()){ c=>
        c.io.in_A.poke(20.U)
        c.io.in_B.poke(68.U)
        c.io.select.poke(true.B)
        c.clock.step(20)

         c.io.out.expect(20.U)




        }
    }

}