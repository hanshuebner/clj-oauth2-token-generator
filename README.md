# clj-oauth2-token-generator

This is a server which can be used to generate OAuth2 tokens for
Google services.  Tokens are stored in EDN files to be used by the
main application.

This illustrates the usage for the
[clj-oauth2 library](https://clojars.org/stuarth/clj-oauth2) as
described in the
[Blog post by Eric Koslow](https://coderwall.com/p/y9w4-g/google-oauth2-in-clojure).

## Options

Put a config.edn file into the resources directory.  Use
config-sample.edn as example.

## Usage

    $ lein run
    
Send your users to the ```/google-oauth``` URL on your server to
generate a token.

## License

Copyright © 2015 Hans Hübner

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
