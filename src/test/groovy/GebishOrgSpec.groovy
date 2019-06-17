import geb.spock.GebReportingSpec
import groovy.util.logging.Slf4j

@Slf4j
class GebishOrgSpec extends GebReportingSpec {

    def "can get to the current Book of Geb"() {
        when: "when"
        to GebishOrgHomePage

        and:"and"
        manualsMenu.open()
        report "screenshot 1"


        then:"then"
        manualsMenu.links[0].text().contains("3.0")

        when:"when"
        manualsMenu.links[0].click()

        then:"then"
        at TheBookOfGebPage
        report "screenshot 2"
    }
}