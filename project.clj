(defproject test-lein-multi-build "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.7.1"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.10.238"]
                 [com.cognitect/transit-cljs "0.8.239"]
                 [com.andrewmcveigh/cljs-time "0.4.0"]
                 [cljs-ajax "0.7.3"]
                 [reagent "0.8.1" :exclusions [org.clojure/clojure]]
                 [cljsjs/prop-types "15.6.2-0" :exclusions [cljsjs/react]]
                 [cljsjs/react-transition-group "1.1.3-0" :exclusions [cljsjs/react cljsjs/react-dom]]
                 [cljsjs/react-select "1.2.1-1" :exclusions [cljsjs/prop-types cljsjs/react cljsjs/react-dom]]
                 [proto-repl "0.3.1"]
                 [re-frisk "0.3.2"]
                 [http-kit "2.3.0"]
                 [binaryage/devtools "0.9.1"]]

  :plugins [[lein-figwheel "0.5.14"]
            [lein-cljsbuild "1.1.5"]
            [lein-doo "0.1.8"]]

  :source-paths ["src"]

  :cljsbuild {:builds
              [{:id "app1"
                :source-paths ["clojure/src/test_lein_multi_build/app1"
                               "clojure/src/test_lein_multi_build/shared"]

                :figwheel true

                :compiler {:main test-lein-multi-build.app1.core
                           :asset-path "js/compiled/out"
                           :output-to "resources/public/js/compiled/app1.js"
                           :output-dir "resources/public/js/compiled/app1_out"
                           :source-map-timestamp true
                           :preloads [devtools.preload]}}
               {:id "app2"
                :source-paths ["clojure/src/test_lein_multi_build/app2"
                               "clojure/src/test_lein_multi_build/shared"]

                :figwheel true

                :compiler {:main test-lein-multi-build.app2.core
                           :asset-path "js/compiled/out"
                           :output-to "resources/public/js/compiled/app2.js"
                           :output-dir "resources/public/js/compiled/app2_out"
                           :source-map-timestamp true
                           :preloads [devtools.preload]}}]}

  :figwheel {:css-dirs ["resources/public/css"]})
