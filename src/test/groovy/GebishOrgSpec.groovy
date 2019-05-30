import geb.spock.GebSpec

class GebishOrgSpec extends GebSpec {

    def "can get to the current Book of Geb"() {
        when:
        to GebishOrgHomePage

        and:
        manualsMenu.open()

        then:
        manualsMenu.links[0].text().contains("3.0")

        when:
        manualsMenu.links[0].click()

        then:
        at TheBookOfGebPage
    }
}