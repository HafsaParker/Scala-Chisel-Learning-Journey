package lab2task
import org.scalatest._
import chiseltest._
import chisel3._
class muxTest extends FreeSpec with ChiselScalatestTester{
    "mux Test" in {
        test(new Mux_2to1()){ c=>
        c.io.in_A.poke(1.U)
        c.io.in_B.poke(0.U)
        c.clock.step(20)
        c.io.out.expect(0.U)




        }
    }

}