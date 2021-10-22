package lab2task
import org.scalatest._
import chiseltest._
import chisel3._
class example11Test extends FreeSpec with ChiselScalatestTester{
    "example11 Test" in {
        test(new Mem_bundle_intf()){ c=>
        c.io.data_in(0).poke(1.U)
        c.io.data_in(1).poke(1.U)
        c.io.data_in(2).poke(1.U)
        c.io.data_in(3).poke(0.U)
        c.io.data_selector.poke("b00".U)
        c.io.addr.poke("b10111".U)
        

        }
    }
}