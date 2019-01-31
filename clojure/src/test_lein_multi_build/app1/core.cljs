(ns test-lein-multi-build.app1.core
  (:require [reagent.core :as r]
            [test-lein-multi-build.shared.utils :refer [greet]]))

(defn App1 []
  [:div
   [:div "This is App1"]
   [:div (greet "user of App2!")]])

(r/render [App1] (.getElementById js/document "app1"))
