(ns test-lein-multi-build.app1.core
  (:require [reagent.core :as r]))

(defn App1 []
  [:div
   [:div "This is app1"]])

(r/render [App1] (.getElementById js/document "app1"))
