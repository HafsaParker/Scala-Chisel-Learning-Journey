package lab4task
import chisel3._
import chisel3.util
import org.scalatest._
import chiseltest._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation
import scala.util.Random
import ALUOP._
class at1Test extends FreeSpec with ChiselScalatestTester {
    "task Test" in {
        test(new BranchControl()){c=>
        val array_b = Array(0 ,1 ,4 ,5 ,6 ,7 )
        for (i <-0 until 100){
            val srca = Random.nextLong() & 0xFFFFFFFFL
            val srcb= Random.nextLong() & 0xFFFFFFFFL
            val bool = Random.nextBoolean()
            val sel = Random.nextInt(6)
            val abc = array_b(sel)
            val result  = abc match{
                case 0 => if (srca == srcb) 1 else 0
                case 1 => if (srca != srcb) 1 else 0 
                case 4 => if (srca < srcb) 1 else 0
                case 5 => if (srca >= srcb) 1 else 0
                case 6 => if (srca < srcb) 1 else 0
                case 7 => if (srca >= srcb) 1 else 0

            }

            println("******srca*******", srca)
            println("******srcb*******", srcb)
            println("******sel*******", abc)
            println("******branch*******", bool)
            println("******result*******", result)
            c.io.arg_x.poke(srca.U)
            c.io.arg_y.poke(srcb.U)
            c.io.fnct3.poke(abc.U)
            c.io.branch.poke(bool.B)
            c.clock.step(1)
            if (result == 1 & bool == true)
            c.io.br_taken.expect(1.B)
            else
            c.io.br_taken.expect(0.B)


            
        }

        }
    }

}