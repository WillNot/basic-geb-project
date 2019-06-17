//package geb
//
//import com.google.common.io.BaseEncoding
//import geb.report.ReportState
//import geb.report.Reporter
//import geb.report.ReportingListener
//import geb.report.ScreenshotReporter
//import groovy.util.logging.Slf4j
//import static com.google.common.io.Resources.asByteSource
//
//
////Class listens for report during tests and takes screenshots
//@Slf4j
//class RpScreenShotListener implements ReportingListener {
//    @Override
//    void onReport(Reporter reporter, ReportState reportState, List<File> reportFiles) {
//        if (reporter instanceof ScreenshotReporter) {
//            def content = asByteSource(reportFiles.first().toURI().toURL()).read()
//            log.debug("RP_MESSAGE#BASE64#${BaseEncoding.base64().encode(content)}#${reportState.label}")
//        }
//    }
//}
