package racetrack



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Race)
class RaceTests {

    void testInMiles() {
    	//instanciando uma nova corrida com a distancia 5km que deve ser igual 
       def race = new Race(distance:5.0)
       //testando se o resultado de 5*0.6214 é 3.107
       assertEquals 3.107, race.inMiles()
    }
}
