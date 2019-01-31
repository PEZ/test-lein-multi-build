(ns test-lein-multi-build.app2.core
  (:require [reagent.core :as r]
            [test-lein-multi-build.app2.info2 :refer [Info2]]
            [test-lein-multi-build.shared.utils :refer [greet]]))

(defn App2 []
  [:div
   [:div "This is App2"]
   [Info2]
   [:div (greet "user of App2!")]])

(r/render [App2] (.getElementById js/document "app2"))
