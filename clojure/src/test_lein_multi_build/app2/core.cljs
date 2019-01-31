(ns test-lein-multi-build.app2.core
  (:require [reagent.core :as r]))

(defn App2 []
  [:div
   [:div "This is app2"]])

(r/render [App1] (.getElementById js/document "app2"))
