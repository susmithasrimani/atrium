package ch.tutteli.atrium.core.robstoll.lib.reporting.translating

import ch.tutteli.atrium.domain.builders.ExpectImpl
import ch.tutteli.atrium.api.verbs.internal.AssertionVerbFactory

//cannot be easily migrated to specs-common/spek2 as it depends on JVM resources => need to find a solution first
object PropertiesPerLocaleTranslationSupplierSpec : ch.tutteli.atrium.specs.reporting.translating.TranslatorIntSpec(
    AssertionVerbFactory,
    { primaryLocale, fallbackLocales ->
        ExpectImpl.reporterBuilder
            .withTranslationSupplier(PropertiesPerLocaleTranslationSupplier())
            .withDefaultLocaleOrderDecider()
            .withDefaultTranslator(primaryLocale, *fallbackLocales)
            .withDetailedObjectFormatter()
            .withDefaultAssertionFormatterController()
            .withDefaultAssertionFormatterFacade()
            .withTextSameLineAssertionPairFormatter()
            .withTextCapabilities()
            .withDefaultAtriumErrorAdjusters()
            .withOnlyFailureReporter()
            .build()
    },
    true,
    "[Atrium's TranslationIntSpec] "
)

