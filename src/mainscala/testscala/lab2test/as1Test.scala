package lab2task
import org.scalatest._
import chiseltest._
import chisel3._
class as1Test extends FreeSpec with ChiselScalatestTester{
    "task22 TEST" in {
        test(new as1()){c=>
        c.io.s1.poke(true.B)
        c.io.s2.poke(true.B)
        c.io.s3.poke(true.B)
        c.clock.step(20)
        c.io.out.expect(32.U)

        }
    }

}
//s0,s1,s2
