(ns test-lein-multi-build.app1.core
  (:require [reagent.core :as r]
            [test-lein-multi-build.shared.utils :refer [greet]]
            [test-lein-multi-build.app1.info1 :refer [Info1]]))

(defn App1 []
  [:div
   [:div "This is App1"]
   [Info1]
   [:div (greet "user of App1!")]])

(r/render [App1] (.getElementById js/document "app1"))
