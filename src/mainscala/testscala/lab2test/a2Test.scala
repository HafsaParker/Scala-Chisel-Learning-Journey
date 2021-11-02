package lab2task
import org.scalatest._
import chiseltest._
import chisel3._
class as2Test extends FreeSpec with ChiselScalatestTester{
    "as2 Test" in {
        test(new barrel_shift()){c=>
        c.io.in(0).poke(true.B)
        c.io.in(1).poke(false.B)
        c.io.in(2).poke(false.B)
        c.io.in(3).poke(false.B)
        c.io.sel.poke("b10".U)
        c.io.shift_type.poke(false.B)
        c.clock.step(20)
        c.io.out(0).expect(false.B)
        c.io.out(1).expect(false.B)
        c.io.out(2).expect(true.B)
        c.io.out(3).expect(false.B)

        }
    }

}