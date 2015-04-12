(defproject phrame "0.1.0-SNAPSHOT"
  :description "Server to generate Google OAuth2 tokens"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [stuarth/clj-oauth2 "0.3.2"]
                 [ring "1.3.2"]
                 [compojure "1.3.3"]
                 [org.apache.httpcomponents/httpclient "4.3.5"]
                 [clj-http "1.1.0"]]
  :main clj-oauth2-token-generator.core)
