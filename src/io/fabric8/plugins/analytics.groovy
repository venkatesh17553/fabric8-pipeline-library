#!/usr/bin/groovy

package io.fabric8.plugins

import io.fabric8.Events

def register() {
    Events.on("build.pass") {
        e, a -> echo "invoking bayesian analytics $e $a"
    }
}
