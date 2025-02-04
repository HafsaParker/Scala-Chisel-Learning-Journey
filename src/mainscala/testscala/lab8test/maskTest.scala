package lab8task
import org.scalatest._
import chiseltest._
import chisel3._
class maskTest extends FreeSpec with ChiselScalatestTester{
    "mask Test" in {
        test(new MaskedReadWriteSmem()){c=>
        c.io.enable.poke(1.B)
        c.io.write.poke(1.B)
        c.io.addr.poke(2.U)
        c.io.mask(0).poke(1.B)
        c.io.mask(1).poke(1.B)
        c.io.mask(2).poke(0.B)
        c.io.mask(3).poke(1.B)
        c.io.dataIn(0).poke(1.U)
        c.io.dataIn(1).poke(1.U)
        c.io.dataIn(2).poke(1.U)
        c.io.dataIn(3).poke(1.U)
        c.clock.step(2)
        // c.io.dataOut(0).expect(1.U)
        // c.io.dataOut(1).expect(1.U)
        // c.io.dataOut(2).expect(1.U)
        // c.io.dataOut(3).expect(1.U)


        }
    }
}
