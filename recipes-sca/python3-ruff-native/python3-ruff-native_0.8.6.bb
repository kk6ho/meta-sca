SUMMARY = "An extremely fast Python linter"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1f9a63dd89863fb66a18c35f56c4b8bc"

PYPI_PACKAGE = "ruff"

CRATES_LIST = "\
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/ahash/0.8.11 \
    crate://crates.io/aho-corasick/1.1.3 \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/anes/0.1.6 \
    crate://crates.io/annotate-snippets/0.6.1 \
    crate://crates.io/annotate-snippets/0.9.2 \
    crate://crates.io/anstream/0.6.13 \
    crate://crates.io/anstyle-parse/0.2.3 \
    crate://crates.io/anstyle-query/1.0.2 \
    crate://crates.io/anstyle-wincon/3.0.2 \
    crate://crates.io/anstyle/1.0.8 \
    crate://crates.io/anyhow/1.0.95 \
    crate://crates.io/append-only-vec/0.1.5 \
    crate://crates.io/arc-swap/1.7.1 \
    crate://crates.io/argfile/0.2.1 \
    crate://crates.io/arrayvec/0.7.4 \
    crate://crates.io/assert_fs/1.1.2 \
    crate://crates.io/autocfg/1.2.0 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/base64/0.22.0 \
    crate://crates.io/bincode/1.3.3 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.6.0 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/boxcar/0.2.7 \
    crate://crates.io/bstr/1.11.1 \
    crate://crates.io/bumpalo/3.16.0 \
    crate://crates.io/byteorder/1.5.0 \
    crate://crates.io/cachedir/0.3.1 \
    crate://crates.io/camino/1.1.9 \
    crate://crates.io/cast/0.3.0 \
    crate://crates.io/castaway/0.2.3 \
    crate://crates.io/cc/1.2.2 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/cfg_aliases/0.1.1 \
    crate://crates.io/cfg_aliases/0.2.1 \
    crate://crates.io/chic/1.2.2 \
    crate://crates.io/chrono/0.4.39 \
    crate://crates.io/ciborium-io/0.2.2 \
    crate://crates.io/ciborium-ll/0.2.2 \
    crate://crates.io/ciborium/0.2.2 \
    crate://crates.io/clap/4.5.23 \
    crate://crates.io/clap_builder/4.5.23 \
    crate://crates.io/clap_complete/4.5.2 \
    crate://crates.io/clap_complete_command/0.6.1 \
    crate://crates.io/clap_complete_nushell/4.5.2 \
    crate://crates.io/clap_derive/4.5.18 \
    crate://crates.io/clap_lex/0.7.4 \
    crate://crates.io/clearscreen/3.0.0 \
    crate://crates.io/codspeed-criterion-compat/2.7.2 \
    crate://crates.io/codspeed/2.7.2 \
    crate://crates.io/colorchoice/1.0.0 \
    crate://crates.io/colored/2.2.0 \
    crate://crates.io/compact_str/0.8.1 \
    crate://crates.io/console/0.15.8 \
    crate://crates.io/console_error_panic_hook/0.1.7 \
    crate://crates.io/console_log/1.0.0 \
    crate://crates.io/core-foundation-sys/0.8.6 \
    crate://crates.io/countme/3.0.1 \
    crate://crates.io/cpufeatures/0.2.13 \
    crate://crates.io/crc32fast/1.4.0 \
    crate://crates.io/criterion-plot/0.5.0 \
    crate://crates.io/criterion/0.5.1 \
    crate://crates.io/crossbeam-channel/0.5.12 \
    crate://crates.io/crossbeam-deque/0.8.5 \
    crate://crates.io/crossbeam-epoch/0.9.18 \
    crate://crates.io/crossbeam-queue/0.3.11 \
    crate://crates.io/crossbeam-utils/0.8.19 \
    crate://crates.io/crossbeam/0.8.4 \
    crate://crates.io/crunchy/0.2.2 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/ctrlc/3.4.5 \
    crate://crates.io/darling/0.20.8 \
    crate://crates.io/darling_core/0.20.8 \
    crate://crates.io/darling_macro/0.20.8 \
    crate://crates.io/dashmap/5.5.3 \
    crate://crates.io/dashmap/6.1.0 \
    crate://crates.io/diff/0.1.13 \
    crate://crates.io/difflib/0.4.0 \
    crate://crates.io/digest/0.10.7 \
    crate://crates.io/dir-test-macros/0.4.1 \
    crate://crates.io/dir-test/0.4.1 \
    crate://crates.io/dirs-sys/0.3.7 \
    crate://crates.io/dirs-sys/0.4.1 \
    crate://crates.io/dirs/4.0.0 \
    crate://crates.io/dirs/5.0.1 \
    crate://crates.io/displaydoc/0.2.5 \
    crate://crates.io/doc-comment/0.3.3 \
    crate://crates.io/drop_bomb/0.1.5 \
    crate://crates.io/dunce/1.0.5 \
    crate://crates.io/dyn-clone/1.0.17 \
    crate://crates.io/either/1.11.0 \
    crate://crates.io/encode_unicode/0.3.6 \
    crate://crates.io/env_filter/0.1.0 \
    crate://crates.io/env_logger/0.11.6 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/errno/0.3.8 \
    crate://crates.io/etcetera/0.8.0 \
    crate://crates.io/fastrand/2.1.1 \
    crate://crates.io/fern/0.7.1 \
    crate://crates.io/filetime/0.2.25 \
    crate://crates.io/flate2/1.0.28 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/form_urlencoded/1.2.1 \
    crate://crates.io/fs-err/2.11.0 \
    crate://crates.io/fsevent-sys/4.1.0 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getopts/0.2.21 \
    crate://crates.io/getrandom/0.2.14 \
    crate://crates.io/glob/0.3.2 \
    crate://crates.io/globset/0.4.15 \
    crate://crates.io/globwalk/0.9.1 \
    crate://crates.io/half/2.4.1 \
    crate://crates.io/hashbrown/0.14.5 \
    crate://crates.io/hashbrown/0.15.2 \
    crate://crates.io/hashlink/0.9.1 \
    crate://crates.io/heck/0.5.0 \
    crate://crates.io/hermit-abi/0.3.9 \
    crate://crates.io/home/0.5.9 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/iana-time-zone/0.1.60 \
    crate://crates.io/icu_collections/1.5.0 \
    crate://crates.io/icu_locid/1.5.0 \
    crate://crates.io/icu_locid_transform/1.5.0 \
    crate://crates.io/icu_locid_transform_data/1.5.0 \
    crate://crates.io/icu_normalizer/1.5.0 \
    crate://crates.io/icu_normalizer_data/1.5.0 \
    crate://crates.io/icu_properties/1.5.1 \
    crate://crates.io/icu_properties_data/1.5.0 \
    crate://crates.io/icu_provider/1.5.0 \
    crate://crates.io/icu_provider_macros/1.5.0 \
    crate://crates.io/ident_case/1.0.1 \
    crate://crates.io/idna/1.0.3 \
    crate://crates.io/idna_adapter/1.2.0 \
    crate://crates.io/ignore/0.4.23 \
    crate://crates.io/imara-diff/0.1.7 \
    crate://crates.io/imperative/1.0.6 \
    crate://crates.io/indexmap/2.7.0 \
    crate://crates.io/indicatif/0.17.9 \
    crate://crates.io/indoc/2.0.5 \
    crate://crates.io/inotify-sys/0.1.5 \
    crate://crates.io/inotify/0.10.2 \
    crate://crates.io/insta-cmd/0.6.0 \
    crate://crates.io/insta/1.41.1 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/is-docker/0.2.0 \
    crate://crates.io/is-macro/0.3.7 \
    crate://crates.io/is-terminal/0.4.12 \
    crate://crates.io/is-wsl/0.4.0 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itertools/0.13.0 \
    crate://crates.io/itoa/1.0.11 \
    crate://crates.io/jobserver/0.1.32 \
    crate://crates.io/jod-thread/0.1.2 \
    crate://crates.io/js-sys/0.3.74 \
    crate://crates.io/kqueue-sys/1.0.4 \
    crate://crates.io/kqueue/1.0.8 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.169 \
    crate://crates.io/libcst/1.5.1 \
    crate://crates.io/libcst_derive/1.4.0 \
    crate://crates.io/libmimalloc-sys/0.1.39 \
    crate://crates.io/libredox/0.1.3 \
    crate://crates.io/linked-hash-map/0.5.6 \
    crate://crates.io/linux-raw-sys/0.4.14 \
    crate://crates.io/litemap/0.7.3 \
    crate://crates.io/lock_api/0.4.11 \
    crate://crates.io/log/0.4.22 \
    crate://crates.io/lsp-server/0.7.8 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/matches/0.1.10 \
    crate://crates.io/matchit/0.8.5 \
    crate://crates.io/memchr/2.7.4 \
    crate://crates.io/mimalloc/0.1.43 \
    crate://crates.io/minicov/0.3.5 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.7.2 \
    crate://crates.io/mio/1.0.2 \
    crate://crates.io/natord/1.0.9 \
    crate://crates.io/newtype-uuid/1.1.3 \
    crate://crates.io/nix/0.28.0 \
    crate://crates.io/nix/0.29.0 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/notify-types/1.0.0 \
    crate://crates.io/notify/7.0.0 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/nu-ansi-term/0.50.1 \
    crate://crates.io/num-traits/0.2.18 \
    crate://crates.io/number_prefix/0.4.0 \
    crate://crates.io/once_cell/1.20.2 \
    crate://crates.io/oorandom/11.1.3 \
    crate://crates.io/option-ext/0.2.0 \
    crate://crates.io/ordermap/0.5.4 \
    crate://crates.io/os_str_bytes/7.0.0 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/parking_lot/0.12.3 \
    crate://crates.io/parking_lot_core/0.9.9 \
    crate://crates.io/paste/1.0.15 \
    crate://crates.io/path-absolutize/3.1.1 \
    crate://crates.io/path-dedot/3.1.1 \
    crate://crates.io/path-slash/0.2.1 \
    crate://crates.io/pathdiff/0.2.3 \
    crate://crates.io/peg-macros/0.8.4 \
    crate://crates.io/peg-runtime/0.8.3 \
    crate://crates.io/peg/0.8.4 \
    crate://crates.io/pep440_rs/0.7.3 \
    crate://crates.io/pep508_rs/0.9.1 \
    crate://crates.io/percent-encoding/2.3.1 \
    crate://crates.io/pest/2.7.11 \
    crate://crates.io/pest_derive/2.7.11 \
    crate://crates.io/pest_generator/2.7.11 \
    crate://crates.io/pest_meta/2.7.11 \
    crate://crates.io/phf/0.11.2 \
    crate://crates.io/phf_codegen/0.11.2 \
    crate://crates.io/phf_generator/0.11.2 \
    crate://crates.io/phf_shared/0.11.2 \
    crate://crates.io/pin-project-lite/0.2.14 \
    crate://crates.io/pkg-config/0.3.30 \
    crate://crates.io/portable-atomic/1.6.0 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/predicates-core/1.0.8 \
    crate://crates.io/predicates-tree/1.0.11 \
    crate://crates.io/predicates/3.1.2 \
    crate://crates.io/pretty_assertions/1.4.1 \
    crate://crates.io/proc-macro2/1.0.92 \
    crate://crates.io/pyproject-toml/0.13.4 \
    crate://crates.io/quick-junit/0.5.1 \
    crate://crates.io/quick-xml/0.37.1 \
    crate://crates.io/quickcheck/1.0.3 \
    crate://crates.io/quickcheck_macros/1.0.0 \
    crate://crates.io/quote/1.0.38 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rayon-core/1.12.1 \
    crate://crates.io/rayon/1.10.0 \
    crate://crates.io/redox_syscall/0.4.1 \
    crate://crates.io/redox_syscall/0.5.3 \
    crate://crates.io/redox_users/0.4.5 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-automata/0.4.8 \
    crate://crates.io/regex-syntax/0.6.29 \
    crate://crates.io/regex-syntax/0.8.5 \
    crate://crates.io/regex/1.11.1 \
    crate://crates.io/ring/0.17.8 \
    crate://crates.io/ron/0.7.1 \
    crate://crates.io/rust-stemmers/1.2.0 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustc-hash/2.1.0 \
    crate://crates.io/rustix/0.38.40 \
    crate://crates.io/rustls-pki-types/1.10.0 \
    crate://crates.io/rustls-webpki/0.102.8 \
    crate://crates.io/rustls/0.23.19 \
    crate://crates.io/rustversion/1.0.15 \
    crate://crates.io/ryu/1.0.17 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/schemars/0.8.21 \
    crate://crates.io/schemars_derive/0.8.21 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/seahash/4.1.0 \
    crate://crates.io/serde-wasm-bindgen/0.6.5 \
    crate://crates.io/serde/1.0.217 \
    crate://crates.io/serde_derive/1.0.217 \
    crate://crates.io/serde_derive_internals/0.29.0 \
    crate://crates.io/serde_json/1.0.134 \
    crate://crates.io/serde_repr/0.1.19 \
    crate://crates.io/serde_spanned/0.6.7 \
    crate://crates.io/serde_test/1.0.177 \
    crate://crates.io/serde_with/3.12.0 \
    crate://crates.io/serde_with_macros/3.12.0 \
    crate://crates.io/sha2/0.10.8 \
    crate://crates.io/sharded-slab/0.1.7 \
    crate://crates.io/shellexpand/3.1.0 \
    crate://crates.io/shlex/1.3.0 \
    crate://crates.io/similar/2.6.0 \
    crate://crates.io/siphasher/0.3.11 \
    crate://crates.io/smallvec/1.13.2 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/stable_deref_trait/1.2.0 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strip-ansi-escapes/0.2.0 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/strsim/0.11.1 \
    crate://crates.io/strum/0.26.3 \
    crate://crates.io/strum_macros/0.26.4 \
    crate://crates.io/subtle/2.5.0 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.93 \
    crate://crates.io/synstructure/0.13.1 \
    crate://crates.io/tempfile/3.14.0 \
    crate://crates.io/terminal_size/0.4.0 \
    crate://crates.io/terminfo/0.8.0 \
    crate://crates.io/termtree/0.4.1 \
    crate://crates.io/test-case-core/3.3.1 \
    crate://crates.io/test-case-macros/3.3.1 \
    crate://crates.io/test-case/3.3.1 \
    crate://crates.io/thiserror-impl/1.0.67 \
    crate://crates.io/thiserror-impl/2.0.9 \
    crate://crates.io/thiserror/1.0.67 \
    crate://crates.io/thiserror/2.0.9 \
    crate://crates.io/thread_local/1.1.8 \
    crate://crates.io/tikv-jemalloc-sys/0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7 \
    crate://crates.io/tikv-jemallocator/0.6.0 \
    crate://crates.io/tinystr/0.7.6 \
    crate://crates.io/tinytemplate/1.2.1 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/toml/0.8.19 \
    crate://crates.io/toml_datetime/0.6.8 \
    crate://crates.io/toml_edit/0.22.20 \
    crate://crates.io/tracing-attributes/0.1.28 \
    crate://crates.io/tracing-core/0.1.33 \
    crate://crates.io/tracing-flame/0.2.0 \
    crate://crates.io/tracing-indicatif/0.3.8 \
    crate://crates.io/tracing-log/0.2.0 \
    crate://crates.io/tracing-subscriber/0.3.19 \
    crate://crates.io/tracing-tree/0.4.0 \
    crate://crates.io/tracing/0.1.41 \
    crate://crates.io/typed-arena/2.0.2 \
    crate://crates.io/typenum/1.17.0 \
    crate://crates.io/ucd-trie/0.1.6 \
    crate://crates.io/unic-char-property/0.9.0 \
    crate://crates.io/unic-char-range/0.9.0 \
    crate://crates.io/unic-common/0.9.0 \
    crate://crates.io/unic-ucd-category/0.9.0 \
    crate://crates.io/unic-ucd-version/0.9.0 \
    crate://crates.io/unicode-ident/1.0.14 \
    crate://crates.io/unicode-normalization/0.1.24 \
    crate://crates.io/unicode-width/0.1.13 \
    crate://crates.io/unicode-width/0.2.0 \
    crate://crates.io/unicode_names2/1.3.0 \
    crate://crates.io/unicode_names2_generator/1.3.0 \
    crate://crates.io/unscanny/0.1.0 \
    crate://crates.io/untrusted/0.9.0 \
    crate://crates.io/ureq/2.12.1 \
    crate://crates.io/url/2.5.4 \
    crate://crates.io/urlencoding/2.1.3 \
    crate://crates.io/utf16_iter/1.0.5 \
    crate://crates.io/utf8_iter/1.0.4 \
    crate://crates.io/utf8parse/0.2.1 \
    crate://crates.io/uuid-macro-internal/1.11.0 \
    crate://crates.io/uuid/1.11.0 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/version-ranges/0.1.1 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/vt100/0.15.2 \
    crate://crates.io/vte/0.11.1 \
    crate://crates.io/vte_generate_state_changes/0.1.1 \
    crate://crates.io/walkdir/2.5.0 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.97 \
    crate://crates.io/wasm-bindgen-futures/0.4.47 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.97 \
    crate://crates.io/wasm-bindgen-macro/0.2.97 \
    crate://crates.io/wasm-bindgen-shared/0.2.97 \
    crate://crates.io/wasm-bindgen-test-macro/0.3.47 \
    crate://crates.io/wasm-bindgen-test/0.3.47 \
    crate://crates.io/wasm-bindgen/0.2.97 \
    crate://crates.io/web-sys/0.3.74 \
    crate://crates.io/web-time/1.1.0 \
    crate://crates.io/webpki-roots/0.26.1 \
    crate://crates.io/which/6.0.1 \
    crate://crates.io/wild/2.2.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.8 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-core/0.52.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-sys/0.59.0 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows-targets/0.52.6 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.6 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.6 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.52.6 \
    crate://crates.io/windows_i686_gnullvm/0.52.6 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.52.6 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.52.6 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.6 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.52.6 \
    crate://crates.io/winnow/0.6.18 \
    crate://crates.io/winsafe/0.0.19 \
    crate://crates.io/write16/1.0.0 \
    crate://crates.io/writeable/0.5.5 \
    crate://crates.io/yansi-term/0.1.2 \
    crate://crates.io/yansi/1.0.1 \
    crate://crates.io/yoke-derive/0.7.4 \
    crate://crates.io/yoke/0.7.4 \
    crate://crates.io/zerocopy-derive/0.7.32 \
    crate://crates.io/zerocopy/0.7.32 \
    crate://crates.io/zerofrom-derive/0.1.4 \
    crate://crates.io/zerofrom/0.1.4 \
    crate://crates.io/zeroize/1.7.0 \
    crate://crates.io/zerovec-derive/0.10.3 \
    crate://crates.io/zerovec/0.10.4 \
    crate://crates.io/zip/0.6.6 \
    crate://crates.io/zstd-safe/5.0.2+zstd.1.5.2 \
    crate://crates.io/zstd-sys/2.0.11+zstd.1.5.6 \
    crate://crates.io/zstd/0.11.2+zstd.1.5.2 \
    git://github.com/astral-sh/lsp-types.git;protocol=https;rev=3512a9f33eadc5402cfab1b8f7340824c8ca1439;nobranch=1;destsuffix=cargo_home/bitbake/lsp-types-0.95.1 \
    git://github.com/salsa-rs/salsa.git;protocol=https;rev=88a1d7774d78f048fbd77d40abca9ebd729fd1f0;nobranch=1;destsuffix=cargo_home/bitbake/salsa-0.18.0 \
    git://github.com/salsa-rs/salsa.git;protocol=https;rev=88a1d7774d78f048fbd77d40abca9ebd729fd1f0;nobranch=1;destsuffix=cargo_home/bitbake/salsa-macro-rules-0.1.0 \
    git://github.com/salsa-rs/salsa.git;protocol=https;rev=88a1d7774d78f048fbd77d40abca9ebd729fd1f0;nobranch=1;destsuffix=cargo_home/bitbake/salsa-macros-0.18.0 \
"

SRC_URI[sha256sum] = "dcad24b81b62650b0eb8814f576fc65cfee8674772a6e24c9b747911801eeaa5"

SRC_URI[adler-1.0.2.sha256sum] = "f26201604c87b1e01bd3d98f8d5d9a8fcbb815e8cedb41ffccbeb4bf593a35fe"
SRC_URI[ahash-0.8.11.sha256sum] = "e89da841a80418a9b391ebaea17f5c112ffaaa96f621d2c285b5174da76b9011"
SRC_URI[aho-corasick-1.1.3.sha256sum] = "8e60d3430d3a69478ad0993f19238d2df97c507009a52b3c10addcd7f6bcb916"
SRC_URI[android-tzdata-0.1.1.sha256sum] = "e999941b234f3131b00bc13c22d06e8c5ff726d1b6318ac7eb276997bbb4fef0"
SRC_URI[android_system_properties-0.1.5.sha256sum] = "819e7219dbd41043ac279b19830f2efc897156490d7fd6ea916720117ee66311"
SRC_URI[anes-0.1.6.sha256sum] = "4b46cbb362ab8752921c97e041f5e366ee6297bd428a31275b9fcf1e380f7299"
SRC_URI[annotate-snippets-0.6.1.sha256sum] = "c7021ce4924a3f25f802b2cccd1af585e39ea1a363a1aa2e72afe54b67a3a7a7"
SRC_URI[annotate-snippets-0.9.2.sha256sum] = "ccaf7e9dfbb6ab22c82e473cd1a8a7bd313c19a5b7e40970f3d89ef5a5c9e81e"
SRC_URI[anstream-0.6.13.sha256sum] = "d96bd03f33fe50a863e394ee9718a706f988b9079b20c3784fb726e7678b62fb"
SRC_URI[anstyle-1.0.8.sha256sum] = "1bec1de6f59aedf83baf9ff929c98f2ad654b97c9510f4e70cf6f661d49fd5b1"
SRC_URI[anstyle-parse-0.2.3.sha256sum] = "c75ac65da39e5fe5ab759307499ddad880d724eed2f6ce5b5e8a26f4f387928c"
SRC_URI[anstyle-query-1.0.2.sha256sum] = "e28923312444cdd728e4738b3f9c9cac739500909bb3d3c94b43551b16517648"
SRC_URI[anstyle-wincon-3.0.2.sha256sum] = "1cd54b81ec8d6180e24654d0b371ad22fc3dd083b6ff8ba325b72e00c87660a7"
SRC_URI[anyhow-1.0.95.sha256sum] = "34ac096ce696dc2fcabef30516bb13c0a68a11d30131d3df6f04711467681b04"
SRC_URI[append-only-vec-0.1.5.sha256sum] = "74d9f7083455f1a474276ccd32374958d2cb591024aac45101c7623b10271347"
SRC_URI[arc-swap-1.7.1.sha256sum] = "69f7f8c3906b62b754cd5326047894316021dcfe5a194c8ea52bdd94934a3457"
SRC_URI[argfile-0.2.1.sha256sum] = "0a1cc0ba69de57db40674c66f7cf2caee3981ddef084388482c95c0e2133e5e8"
SRC_URI[arrayvec-0.7.4.sha256sum] = "96d30a06541fbafbc7f82ed10c06164cfbd2c401138f6addd8404629c4b16711"
SRC_URI[assert_fs-1.1.2.sha256sum] = "7efdb1fdb47602827a342857666feb372712cbc64b414172bd6b167a02927674"
SRC_URI[autocfg-1.2.0.sha256sum] = "f1fdabc7756949593fe60f30ec81974b613357de856987752631dea1e3394c80"
SRC_URI[base64-0.13.1.sha256sum] = "9e1b586273c5702936fe7b7d6896644d8be71e6314cfe09d3167c95f712589e8"
SRC_URI[base64-0.22.0.sha256sum] = "9475866fec1451be56a3c2400fd081ff546538961565ccb5b7142cbd22bc7a51"
SRC_URI[bincode-1.3.3.sha256sum] = "b1f45e9417d87227c7a56d22e471c6206462cba514c7590c09aff4cf6d1ddcad"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bitflags-2.6.0.sha256sum] = "b048fb63fd8b5923fc5aa7b340d8e156aec7ec02f0c78fa8a6ddc2613f6f71de"
SRC_URI[block-buffer-0.10.4.sha256sum] = "3078c7629b62d3f0439517fa394996acacc5cbc91c5a20d8c658e77abd503a71"
SRC_URI[boxcar-0.2.7.sha256sum] = "7f839cdf7e2d3198ac6ca003fd8ebc61715755f41c1cad15ff13df67531e00ed"
SRC_URI[bstr-1.11.1.sha256sum] = "786a307d683a5bf92e6fd5fd69a7eb613751668d1d8d67d802846dfe367c62c8"
SRC_URI[bumpalo-3.16.0.sha256sum] = "79296716171880943b8470b5f8d03aa55eb2e645a4874bdbb28adb49162e012c"
SRC_URI[byteorder-1.5.0.sha256sum] = "1fd0f2584146f6f2ef48085050886acf353beff7305ebd1ae69500e27c67f64b"
SRC_URI[cachedir-0.3.1.sha256sum] = "4703f3937077db8fa35bee3c8789343c1aec2585f0146f09d658d4ccc0e8d873"
SRC_URI[camino-1.1.9.sha256sum] = "8b96ec4966b5813e2c0507c1f86115c8c5abaadc3980879c3424042a02fd1ad3"
SRC_URI[cast-0.3.0.sha256sum] = "37b2a672a2cb129a2e41c10b1224bb368f9f37a2b16b612598138befd7b37eb5"
SRC_URI[castaway-0.2.3.sha256sum] = "0abae9be0aaf9ea96a3b1b8b1b55c602ca751eba1b1500220cea4ecbafe7c0d5"
SRC_URI[cc-1.2.2.sha256sum] = "f34d93e62b03caf570cccc334cbc6c2fceca82f39211051345108adcba3eebdc"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[cfg_aliases-0.1.1.sha256sum] = "fd16c4719339c4530435d38e511904438d07cce7950afa3718a84ac36c10e89e"
SRC_URI[cfg_aliases-0.2.1.sha256sum] = "613afe47fcd5fac7ccf1db93babcb082c5994d996f20b8b159f2ad1658eb5724"
SRC_URI[chic-1.2.2.sha256sum] = "a5b5db619f3556839cb2223ae86ff3f9a09da2c5013be42bc9af08c9589bf70c"
SRC_URI[chrono-0.4.39.sha256sum] = "7e36cc9d416881d2e24f9a963be5fb1cd90966419ac844274161d10488b3e825"
SRC_URI[ciborium-0.2.2.sha256sum] = "42e69ffd6f0917f5c029256a24d0161db17cea3997d185db0d35926308770f0e"
SRC_URI[ciborium-io-0.2.2.sha256sum] = "05afea1e0a06c9be33d539b876f1ce3692f4afea2cb41f740e7743225ed1c757"
SRC_URI[ciborium-ll-0.2.2.sha256sum] = "57663b653d948a338bfb3eeba9bb2fd5fcfaecb9e199e87e1eda4d9e8b240fd9"
SRC_URI[clap-4.5.23.sha256sum] = "3135e7ec2ef7b10c6ed8950f0f792ed96ee093fa088608f1c76e569722700c84"
SRC_URI[clap_builder-4.5.23.sha256sum] = "30582fc632330df2bd26877bde0c1f4470d57c582bbc070376afcd04d8cb4838"
SRC_URI[clap_complete-4.5.2.sha256sum] = "dd79504325bf38b10165b02e89b4347300f855f273c4cb30c4a3209e6583275e"
SRC_URI[clap_complete_command-0.6.1.sha256sum] = "da8e198c052315686d36371e8a3c5778b7852fc75cc313e4e11eeb7a644a1b62"
SRC_URI[clap_complete_nushell-4.5.2.sha256sum] = "1accf1b463dee0d3ab2be72591dccdab8bef314958340447c882c4c72acfe2a3"
SRC_URI[clap_derive-4.5.18.sha256sum] = "4ac6a0c7b1a9e9a5186361f67dfa1b88213572f427fb9ab038efb2bd8c582dab"
SRC_URI[clap_lex-0.7.4.sha256sum] = "f46ad14479a25103f283c0f10005961cf086d8dc42205bb44c46ac563475dca6"
SRC_URI[clearscreen-3.0.0.sha256sum] = "2f8c93eb5f77c9050c7750e14f13ef1033a40a0aac70c6371535b6763a01438c"
SRC_URI[codspeed-2.7.2.sha256sum] = "450a0e9df9df1c154156f4344f99d8f6f6e69d0fc4de96ef6e2e68b2ec3bce97"
SRC_URI[codspeed-criterion-compat-2.7.2.sha256sum] = "8eb1a6cb9c20e177fde58cdef97c1c7c9264eb1424fe45c4fccedc2fb078a569"
SRC_URI[colorchoice-1.0.0.sha256sum] = "acbf1af155f9b9ef647e42cdc158db4b64a1b61f743629225fde6f3e0be2a7c7"
SRC_URI[colored-2.2.0.sha256sum] = "117725a109d387c937a1533ce01b450cbde6b88abceea8473c4d7a85853cda3c"
SRC_URI[compact_str-0.8.1.sha256sum] = "3b79c4069c6cad78e2e0cdfcbd26275770669fb39fd308a752dc110e83b9af32"
SRC_URI[console-0.15.8.sha256sum] = "0e1f83fc076bd6dd27517eacdf25fef6c4dfe5f1d7448bafaaf3a26f13b5e4eb"
SRC_URI[console_error_panic_hook-0.1.7.sha256sum] = "a06aeb73f470f66dcdbf7223caeebb85984942f22f1adb2a088cf9668146bbbc"
SRC_URI[console_log-1.0.0.sha256sum] = "be8aed40e4edbf4d3b4431ab260b63fdc40f5780a4766824329ea0f1eefe3c0f"
SRC_URI[core-foundation-sys-0.8.6.sha256sum] = "06ea2b9bc92be3c2baa9334a323ebca2d6f074ff852cd1d7b11064035cd3868f"
SRC_URI[countme-3.0.1.sha256sum] = "7704b5fdd17b18ae31c4c1da5a2e0305a2bf17b5249300a9ee9ed7b72114c636"
SRC_URI[cpufeatures-0.2.13.sha256sum] = "51e852e6dc9a5bed1fae92dd2375037bf2b768725bf3be87811edee3249d09ad"
SRC_URI[crc32fast-1.4.0.sha256sum] = "b3855a8a784b474f333699ef2bbca9db2c4a1f6d9088a90a2d25b1eb53111eaa"
SRC_URI[criterion-0.5.1.sha256sum] = "f2b12d017a929603d80db1831cd3a24082f8137ce19c69e6447f54f5fc8d692f"
SRC_URI[criterion-plot-0.5.0.sha256sum] = "6b50826342786a51a89e2da3a28f1c32b06e387201bc2d19791f622c673706b1"
SRC_URI[crossbeam-0.8.4.sha256sum] = "1137cd7e7fc0fb5d3c5a8678be38ec56e819125d8d7907411fe24ccb943faca8"
SRC_URI[crossbeam-channel-0.5.12.sha256sum] = "ab3db02a9c5b5121e1e42fbdb1aeb65f5e02624cc58c43f2884c6ccac0b82f95"
SRC_URI[crossbeam-deque-0.8.5.sha256sum] = "613f8cc01fe9cf1a3eb3d7f488fd2fa8388403e97039e2f73692932e291a770d"
SRC_URI[crossbeam-epoch-0.9.18.sha256sum] = "5b82ac4a3c2ca9c3460964f020e1402edd5753411d7737aa39c3714ad1b5420e"
SRC_URI[crossbeam-queue-0.3.11.sha256sum] = "df0346b5d5e76ac2fe4e327c5fd1118d6be7c51dfb18f9b7922923f287471e35"
SRC_URI[crossbeam-utils-0.8.19.sha256sum] = "248e3bacc7dc6baa3b21e405ee045c3047101a49145e7e9eca583ab4c2ca5345"
SRC_URI[crunchy-0.2.2.sha256sum] = "7a81dae078cea95a014a339291cec439d2f232ebe854a9d672b796c6afafa9b7"
SRC_URI[crypto-common-0.1.6.sha256sum] = "1bfb12502f3fc46cca1bb51ac28df9d618d813cdc3d2f25b9fe775a34af26bb3"
SRC_URI[ctrlc-3.4.5.sha256sum] = "90eeab0aa92f3f9b4e87f258c72b139c207d251f9cbc1080a0086b86a8870dd3"
SRC_URI[darling-0.20.8.sha256sum] = "54e36fcd13ed84ffdfda6f5be89b31287cbb80c439841fe69e04841435464391"
SRC_URI[darling_core-0.20.8.sha256sum] = "9c2cf1c23a687a1feeb728783b993c4e1ad83d99f351801977dd809b48d0a70f"
SRC_URI[darling_macro-0.20.8.sha256sum] = "a668eda54683121533a393014d8692171709ff57a7d61f187b6e782719f8933f"
SRC_URI[dashmap-5.5.3.sha256sum] = "978747c1d849a7d2ee5e8adc0159961c48fb7e5db2f06af6723b80123bb53856"
SRC_URI[dashmap-6.1.0.sha256sum] = "5041cc499144891f3790297212f32a74fb938e5136a14943f338ef9e0ae276cf"
SRC_URI[diff-0.1.13.sha256sum] = "56254986775e3233ffa9c4d7d3faaf6d36a2c09d30b20687e9f88bc8bafc16c8"
SRC_URI[difflib-0.4.0.sha256sum] = "6184e33543162437515c2e2b48714794e37845ec9851711914eec9d308f6ebe8"
SRC_URI[digest-0.10.7.sha256sum] = "9ed9a281f7bc9b7576e61468ba615a66a5c8cfdff42420a70aa82701a3b1e292"
SRC_URI[dir-test-0.4.1.sha256sum] = "62c013fe825864f3e4593f36426c1fa7a74f5603f13ca8d1af7a990c1cd94a79"
SRC_URI[dir-test-macros-0.4.1.sha256sum] = "d42f54d7b4a6bc2400fe5b338e35d1a335787585375322f49c5d5fe7b243da7e"
SRC_URI[dirs-4.0.0.sha256sum] = "ca3aa72a6f96ea37bbc5aa912f6788242832f75369bdfdadcb0e38423f100059"
SRC_URI[dirs-5.0.1.sha256sum] = "44c45a9d03d6676652bcb5e724c7e988de1acad23a711b5217ab9cbecbec2225"
SRC_URI[dirs-sys-0.3.7.sha256sum] = "1b1d1d91c932ef41c0f2663aa8b0ca0342d444d842c06914aa0a7e352d0bada6"
SRC_URI[dirs-sys-0.4.1.sha256sum] = "520f05a5cbd335fae5a99ff7a6ab8627577660ee5cfd6a94a6a929b52ff0321c"
SRC_URI[displaydoc-0.2.5.sha256sum] = "97369cbbc041bc366949bc74d34658d6cda5621039731c6310521892a3a20ae0"
SRC_URI[doc-comment-0.3.3.sha256sum] = "fea41bba32d969b513997752735605054bc0dfa92b4c56bf1189f2e174be7a10"
SRC_URI[drop_bomb-0.1.5.sha256sum] = "9bda8e21c04aca2ae33ffc2fd8c23134f3cac46db123ba97bd9d3f3b8a4a85e1"
SRC_URI[dunce-1.0.5.sha256sum] = "92773504d58c093f6de2459af4af33faa518c13451eb8f2b5698ed3d36e7c813"
SRC_URI[dyn-clone-1.0.17.sha256sum] = "0d6ef0072f8a535281e4876be788938b528e9a1d43900b82c2569af7da799125"
SRC_URI[either-1.11.0.sha256sum] = "a47c1c47d2f5964e29c61246e81db715514cd532db6b5116a25ea3c03d6780a2"
SRC_URI[encode_unicode-0.3.6.sha256sum] = "a357d28ed41a50f9c765dbfe56cbc04a64e53e5fc58ba79fbc34c10ef3df831f"
SRC_URI[env_filter-0.1.0.sha256sum] = "a009aa4810eb158359dda09d0c87378e4bbb89b5a801f016885a4707ba24f7ea"
SRC_URI[env_logger-0.11.6.sha256sum] = "dcaee3d8e3cfc3fd92428d477bc97fc29ec8716d180c0d74c643bb26166660e0"
SRC_URI[equivalent-1.0.1.sha256sum] = "5443807d6dff69373d433ab9ef5378ad8df50ca6298caf15de6e52e24aaf54d5"
SRC_URI[errno-0.3.8.sha256sum] = "a258e46cdc063eb8519c00b9fc845fc47bcfca4130e2f08e88665ceda8474245"
SRC_URI[etcetera-0.8.0.sha256sum] = "136d1b5283a1ab77bd9257427ffd09d8667ced0570b6f938942bc7568ed5b943"
SRC_URI[fastrand-2.1.1.sha256sum] = "e8c02a5121d4ea3eb16a80748c74f5549a5665e4c21333c6098f283870fbdea6"
SRC_URI[fern-0.7.1.sha256sum] = "4316185f709b23713e41e3195f90edef7fb00c3ed4adc79769cf09cc762a3b29"
SRC_URI[filetime-0.2.25.sha256sum] = "35c0522e981e68cbfa8c3f978441a5f34b30b96e146b33cd3359176b50fe8586"
SRC_URI[flate2-1.0.28.sha256sum] = "46303f565772937ffe1d394a4fac6f411c6013172fadde9dcdb1e147a086940e"
SRC_URI[fnv-1.0.7.sha256sum] = "3f9eec918d3f24069decb9af1554cad7c880e2da24a9afd88aca000531ab82c1"
SRC_URI[form_urlencoded-1.2.1.sha256sum] = "e13624c2627564efccf4934284bdd98cbaa14e79b0b5a141218e507b3a823456"
SRC_URI[fs-err-2.11.0.sha256sum] = "88a41f105fe1d5b6b34b2055e3dc59bb79b46b48b2040b9e6c7b4b5de097aa41"
SRC_URI[fsevent-sys-4.1.0.sha256sum] = "76ee7a02da4d231650c7cea31349b889be2f45ddb3ef3032d2ec8185f6313fd2"
SRC_URI[generic-array-0.14.7.sha256sum] = "85649ca51fd72272d7821adaf274ad91c288277713d9c18820d8499a7ff69e9a"
SRC_URI[getopts-0.2.21.sha256sum] = "14dbbfd5c71d70241ecf9e6f13737f7b5ce823821063188d7e46c41d371eebd5"
SRC_URI[getrandom-0.2.14.sha256sum] = "94b22e06ecb0110981051723910cbf0b5f5e09a2062dd7663334ee79a9d1286c"
SRC_URI[glob-0.3.2.sha256sum] = "a8d1add55171497b4705a648c6b583acafb01d58050a51727785f0b2c8e0a2b2"
SRC_URI[globset-0.4.15.sha256sum] = "15f1ce686646e7f1e19bf7d5533fe443a45dbfb990e00629110797578b42fb19"
SRC_URI[globwalk-0.9.1.sha256sum] = "0bf760ebf69878d9fd8f110c89703d90ce35095324d1f1edcb595c63945ee757"
SRC_URI[half-2.4.1.sha256sum] = "6dd08c532ae367adf81c312a4580bc67f1d0fe8bc9c460520283f4c0ff277888"
SRC_URI[hashbrown-0.14.5.sha256sum] = "e5274423e17b7c9fc20b6e7e208532f9b19825d82dfd615708b70edd83df41f1"
SRC_URI[hashbrown-0.15.2.sha256sum] = "bf151400ff0baff5465007dd2f3e717f3fe502074ca563069ce3a6629d07b289"
SRC_URI[hashlink-0.9.1.sha256sum] = "6ba4ff7128dee98c7dc9794b6a411377e1404dba1c97deb8d1a55297bd25d8af"
SRC_URI[heck-0.5.0.sha256sum] = "2304e00983f87ffb38b55b444b5e3b60a884b5d30c0fca7d82fe33449bbe55ea"
SRC_URI[hermit-abi-0.3.9.sha256sum] = "d231dfb89cfffdbc30e7fc41579ed6066ad03abda9e567ccafae602b97ec5024"
SRC_URI[home-0.5.9.sha256sum] = "e3d1354bf6b7235cb4a0576c2619fd4ed18183f689b12b006a0ee7329eeff9a5"
SRC_URI[humantime-2.1.0.sha256sum] = "9a3a5bfb195931eeb336b2a7b4d761daec841b97f947d34394601737a7bba5e4"
SRC_URI[iana-time-zone-0.1.60.sha256sum] = "e7ffbb5a1b541ea2561f8c41c087286cc091e21e556a4f09a8f6cbf17b69b141"
SRC_URI[iana-time-zone-haiku-0.1.2.sha256sum] = "f31827a206f56af32e590ba56d5d2d085f558508192593743f16b2306495269f"
SRC_URI[icu_collections-1.5.0.sha256sum] = "db2fa452206ebee18c4b5c2274dbf1de17008e874b4dc4f0aea9d01ca79e4526"
SRC_URI[icu_locid-1.5.0.sha256sum] = "13acbb8371917fc971be86fc8057c41a64b521c184808a698c02acc242dbf637"
SRC_URI[icu_locid_transform-1.5.0.sha256sum] = "01d11ac35de8e40fdeda00d9e1e9d92525f3f9d887cdd7aa81d727596788b54e"
SRC_URI[icu_locid_transform_data-1.5.0.sha256sum] = "fdc8ff3388f852bede6b579ad4e978ab004f139284d7b28715f773507b946f6e"
SRC_URI[icu_normalizer-1.5.0.sha256sum] = "19ce3e0da2ec68599d193c93d088142efd7f9c5d6fc9b803774855747dc6a84f"
SRC_URI[icu_normalizer_data-1.5.0.sha256sum] = "f8cafbf7aa791e9b22bec55a167906f9e1215fd475cd22adfcf660e03e989516"
SRC_URI[icu_properties-1.5.1.sha256sum] = "93d6020766cfc6302c15dbbc9c8778c37e62c14427cb7f6e601d849e092aeef5"
SRC_URI[icu_properties_data-1.5.0.sha256sum] = "67a8effbc3dd3e4ba1afa8ad918d5684b8868b3b26500753effea8d2eed19569"
SRC_URI[icu_provider-1.5.0.sha256sum] = "6ed421c8a8ef78d3e2dbc98a973be2f3770cb42b606e3ab18d6237c4dfde68d9"
SRC_URI[icu_provider_macros-1.5.0.sha256sum] = "1ec89e9337638ecdc08744df490b221a7399bf8d164eb52a665454e60e075ad6"
SRC_URI[ident_case-1.0.1.sha256sum] = "b9e0384b61958566e926dc50660321d12159025e767c18e043daf26b70104c39"
SRC_URI[idna-1.0.3.sha256sum] = "686f825264d630750a544639377bae737628043f20d38bbc029e8f29ea968a7e"
SRC_URI[idna_adapter-1.2.0.sha256sum] = "daca1df1c957320b2cf139ac61e7bd64fed304c5040df000a745aa1de3b4ef71"
SRC_URI[ignore-0.4.23.sha256sum] = "6d89fd380afde86567dfba715db065673989d6253f42b88179abd3eae47bda4b"
SRC_URI[imara-diff-0.1.7.sha256sum] = "fc9da1a252bd44cd341657203722352efc9bc0c847d06ea6d2dc1cd1135e0a01"
SRC_URI[imperative-1.0.6.sha256sum] = "29a1f6526af721f9aec9ceed7ab8ebfca47f3399d08b80056c2acca3fcb694a9"
SRC_URI[indexmap-2.7.0.sha256sum] = "62f822373a4fe84d4bb149bf54e584a7f4abec90e072ed49cda0edea5b95471f"
SRC_URI[indicatif-0.17.9.sha256sum] = "cbf675b85ed934d3c67b5c5469701eec7db22689d0a2139d856e0925fa28b281"
SRC_URI[indoc-2.0.5.sha256sum] = "b248f5224d1d606005e02c97f5aa4e88eeb230488bcc03bc9ca4d7991399f2b5"
SRC_URI[inotify-0.10.2.sha256sum] = "fdd168d97690d0b8c412d6b6c10360277f4d7ee495c5d0d5d5fe0854923255cc"
SRC_URI[inotify-sys-0.1.5.sha256sum] = "e05c02b5e89bff3b946cedeca278abc628fe811e604f027c45a8aa3cf793d0eb"
SRC_URI[insta-1.41.1.sha256sum] = "7e9ffc4d4892617c50a928c52b2961cb5174b6fc6ebf252b2fac9d21955c48b8"
SRC_URI[insta-cmd-0.6.0.sha256sum] = "ffeeefa927925cced49ccb01bf3e57c9d4cd132df21e576eb9415baeab2d3de6"
SRC_URI[instant-0.1.12.sha256sum] = "7a5bbe824c507c5da5956355e86a746d82e0e1464f65d862cc5e71da70e94b2c"
SRC_URI[is-docker-0.2.0.sha256sum] = "928bae27f42bc99b60d9ac7334e3a21d10ad8f1835a4e12ec3ec0464765ed1b3"
SRC_URI[is-macro-0.3.7.sha256sum] = "1d57a3e447e24c22647738e4607f1df1e0ec6f72e16182c4cd199f647cdfb0e4"
SRC_URI[is-terminal-0.4.12.sha256sum] = "f23ff5ef2b80d608d61efee834934d862cd92461afc0560dedf493e4c033738b"
SRC_URI[is-wsl-0.4.0.sha256sum] = "173609498df190136aa7dea1a91db051746d339e18476eed5ca40521f02d7aa5"
SRC_URI[itertools-0.10.5.sha256sum] = "b0fd2260e829bddf4cb6ea802289de2f86d6a7a690192fbe91b3f46e0f2c8473"
SRC_URI[itertools-0.13.0.sha256sum] = "413ee7dfc52ee1a4949ceeb7dbc8a33f2d6c088194d9f922fb8318faf1f01186"
SRC_URI[itoa-1.0.11.sha256sum] = "49f1f14873335454500d59611f1cf4a4b0f786f9ac11f4312a78e4cf2566695b"
SRC_URI[jobserver-0.1.32.sha256sum] = "48d1dbcbbeb6a7fec7e059840aa538bd62aaccf972c7346c4d9d2059312853d0"
SRC_URI[jod-thread-0.1.2.sha256sum] = "8b23360e99b8717f20aaa4598f5a6541efbe30630039fbc7706cf954a87947ae"
SRC_URI[js-sys-0.3.74.sha256sum] = "a865e038f7f6ed956f788f0d7d60c541fff74c7bd74272c5d4cf15c63743e705"
SRC_URI[kqueue-1.0.8.sha256sum] = "7447f1ca1b7b563588a205fe93dea8df60fd981423a768bc1c0ded35ed147d0c"
SRC_URI[kqueue-sys-1.0.4.sha256sum] = "ed9625ffda8729b85e45cf04090035ac368927b8cebc34898e7c120f52e4838b"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[libc-0.2.169.sha256sum] = "b5aba8db14291edd000dfcc4d620c7ebfb122c613afb886ca8803fa4e128a20a"
SRC_URI[libcst-1.5.1.sha256sum] = "fa3e60579a8cba3d86aa4a5f7fc98973cc0fd2ac270bf02f85a9bef09700b075"
SRC_URI[libcst_derive-1.4.0.sha256sum] = "a2ae40017ac09cd2c6a53504cb3c871c7f2b41466eac5bc66ba63f39073b467b"
SRC_URI[libmimalloc-sys-0.1.39.sha256sum] = "23aa6811d3bd4deb8a84dde645f943476d13b248d818edcf8ce0b2f37f036b44"
SRC_URI[libredox-0.1.3.sha256sum] = "c0ff37bd590ca25063e35af745c343cb7a0271906fb7b37e4813e8f79f00268d"
SRC_URI[linked-hash-map-0.5.6.sha256sum] = "0717cef1bc8b636c6e1c1bbdefc09e6322da8a9321966e8928ef80d20f7f770f"
SRC_URI[linux-raw-sys-0.4.14.sha256sum] = "78b3ae25bc7c8c38cec158d1f2757ee79e9b3740fbc7ccf0e59e4b08d793fa89"
SRC_URI[litemap-0.7.3.sha256sum] = "643cb0b8d4fcc284004d5fd0d67ccf61dfffadb7f75e1e71bc420f4688a3a704"
SRC_URI[lock_api-0.4.11.sha256sum] = "3c168f8615b12bc01f9c17e2eb0cc07dcae1940121185446edc3744920e8ef45"
SRC_URI[log-0.4.22.sha256sum] = "a7a70ba024b9dc04c27ea2f0c0548feb474ec5c54bba33a7f72f873a39d07b24"
SRC_URI[lsp-server-0.7.8.sha256sum] = "9462c4dc73e17f971ec1f171d44bfffb72e65a130117233388a0ebc7ec5656f9"
SRC_URI[matchers-0.1.0.sha256sum] = "8263075bb86c5a1b1427b5ae862e8889656f126e9f77c484496e8b47cf5c5558"
SRC_URI[matches-0.1.10.sha256sum] = "2532096657941c2fea9c289d370a250971c689d4f143798ff67113ec042024a5"
SRC_URI[matchit-0.8.5.sha256sum] = "bd0aa4b8ca861b08d68afc8702af3250776898c1508b278e1da9d01e01d4b45c"
SRC_URI[memchr-2.7.4.sha256sum] = "78ca9ab1a0babb1e7d5695e3530886289c18cf2f87ec19a575a0abdce112e3a3"
SRC_URI[mimalloc-0.1.43.sha256sum] = "68914350ae34959d83f732418d51e2427a794055d0b9529f48259ac07af65633"
SRC_URI[minicov-0.3.5.sha256sum] = "5c71e683cd655513b99affab7d317deb690528255a0d5f717f1024093c12b169"
SRC_URI[minimal-lexical-0.2.1.sha256sum] = "68354c5c6bd36d73ff3feceb05efa59b6acb7626617f4962be322a825e61f79a"
SRC_URI[miniz_oxide-0.7.2.sha256sum] = "9d811f3e15f28568be3407c8e7fdb6514c1cda3cb30683f15b6a1a1dc4ea14a7"
SRC_URI[mio-1.0.2.sha256sum] = "80e04d1dcff3aae0704555fe5fee3bcfaf3d1fdf8a7e521d5b9d2b42acb52cec"
SRC_URI[natord-1.0.9.sha256sum] = "308d96db8debc727c3fd9744aac51751243420e46edf401010908da7f8d5e57c"
SRC_URI[newtype-uuid-1.1.3.sha256sum] = "4c8781e2ef64806278a55ad223f0bc875772fd40e1fe6e73e8adbf027817229d"
SRC_URI[nix-0.28.0.sha256sum] = "ab2156c4fce2f8df6c499cc1c763e4394b7482525bf2a9701c9d79d215f519e4"
SRC_URI[nix-0.29.0.sha256sum] = "71e2746dc3a24dd78b3cfcb7be93368c6de9963d30f43a6a73998a9cf4b17b46"
SRC_URI[nom-7.1.3.sha256sum] = "d273983c5a657a70a3e8f2a01329822f3b8c8172b73826411a55751e404a0a4a"
SRC_URI[notify-7.0.0.sha256sum] = "c533b4c39709f9ba5005d8002048266593c1cfaf3c5f0739d5b8ab0c6c504009"
SRC_URI[notify-types-1.0.0.sha256sum] = "7393c226621f817964ffb3dc5704f9509e107a8b024b489cc2c1b217378785df"
SRC_URI[nu-ansi-term-0.46.0.sha256sum] = "77a8165726e8236064dbb45459242600304b42a5ea24ee2948e18e023bf7ba84"
SRC_URI[nu-ansi-term-0.50.1.sha256sum] = "d4a28e057d01f97e61255210fcff094d74ed0466038633e95017f5beb68e4399"
SRC_URI[num-traits-0.2.18.sha256sum] = "da0df0e5185db44f69b44f26786fe401b6c293d1907744beaa7fa62b2e5a517a"
SRC_URI[number_prefix-0.4.0.sha256sum] = "830b246a0e5f20af87141b25c173cd1b609bd7779a4617d6ec582abaf90870f3"
SRC_URI[once_cell-1.20.2.sha256sum] = "1261fe7e33c73b354eab43b1273a57c8f967d0391e80353e51f764ac02cf6775"
SRC_URI[oorandom-11.1.3.sha256sum] = "0ab1bc2a289d34bd04a330323ac98a1b4bc82c9d9fcb1e66b63caa84da26b575"
SRC_URI[option-ext-0.2.0.sha256sum] = "04744f49eae99ab78e0d5c0b603ab218f515ea8cfe5a456d7629ad883a3b6e7d"
SRC_URI[ordermap-0.5.4.sha256sum] = "f80a48eb68b6a7da9829b8b0429011708f775af80676a91063d023a66a656106"
SRC_URI[os_str_bytes-7.0.0.sha256sum] = "7ac44c994af577c799b1b4bd80dc214701e349873ad894d6cdf96f4f7526e0b9"
SRC_URI[overload-0.1.1.sha256sum] = "b15813163c1d831bf4a13c3610c05c0d03b39feb07f7e09fa234dac9b15aaf39"
SRC_URI[parking_lot-0.12.3.sha256sum] = "f1bf18183cf54e8d6059647fc3063646a1801cf30896933ec2311622cc4b9a27"
SRC_URI[parking_lot_core-0.9.9.sha256sum] = "4c42a9226546d68acdd9c0a280d17ce19bfe27a46bf68784e4066115788d008e"
SRC_URI[paste-1.0.15.sha256sum] = "57c0d7b74b563b49d38dae00a0c37d4d6de9b432382b2892f0574ddcae73fd0a"
SRC_URI[path-absolutize-3.1.1.sha256sum] = "e4af381fe79fa195b4909485d99f73a80792331df0625188e707854f0b3383f5"
SRC_URI[path-dedot-3.1.1.sha256sum] = "07ba0ad7e047712414213ff67533e6dd477af0a4e1d14fb52343e53d30ea9397"
SRC_URI[path-slash-0.2.1.sha256sum] = "1e91099d4268b0e11973f036e885d652fb0b21fedcf69738c627f94db6a44f42"
SRC_URI[pathdiff-0.2.3.sha256sum] = "df94ce210e5bc13cb6651479fa48d14f601d9858cfe0467f43ae157023b938d3"
SRC_URI[peg-0.8.4.sha256sum] = "295283b02df346d1ef66052a757869b2876ac29a6bb0ac3f5f7cd44aebe40e8f"
SRC_URI[peg-macros-0.8.4.sha256sum] = "bdad6a1d9cf116a059582ce415d5f5566aabcd4008646779dab7fdc2a9a9d426"
SRC_URI[peg-runtime-0.8.3.sha256sum] = "e3aeb8f54c078314c2065ee649a7241f46b9d8e418e1a9581ba0546657d7aa3a"
SRC_URI[pep440_rs-0.7.3.sha256sum] = "31095ca1f396e3de32745f42b20deef7bc09077f918b085307e8eab6ddd8fb9c"
SRC_URI[pep508_rs-0.9.1.sha256sum] = "8c2feee999fa547bacab06a4881bacc74688858b92fa8ef1e206c748b0a76048"
SRC_URI[percent-encoding-2.3.1.sha256sum] = "e3148f5046208a5d56bcfc03053e3ca6334e51da8dfb19b6cdc8b306fae3283e"
SRC_URI[pest-2.7.11.sha256sum] = "cd53dff83f26735fdc1ca837098ccf133605d794cdae66acfc2bfac3ec809d95"
SRC_URI[pest_derive-2.7.11.sha256sum] = "2a548d2beca6773b1c244554d36fcf8548a8a58e74156968211567250e48e49a"
SRC_URI[pest_generator-2.7.11.sha256sum] = "3c93a82e8d145725dcbaf44e5ea887c8a869efdcc28706df2d08c69e17077183"
SRC_URI[pest_meta-2.7.11.sha256sum] = "a941429fea7e08bedec25e4f6785b6ffaacc6b755da98df5ef3e7dcf4a124c4f"
SRC_URI[phf-0.11.2.sha256sum] = "ade2d8b8f33c7333b51bcf0428d37e217e9f32192ae4772156f65063b8ce03dc"
SRC_URI[phf_codegen-0.11.2.sha256sum] = "e8d39688d359e6b34654d328e262234662d16cc0f60ec8dcbe5e718709342a5a"
SRC_URI[phf_generator-0.11.2.sha256sum] = "48e4cc64c2ad9ebe670cb8fd69dd50ae301650392e81c05f9bfcb2d5bdbc24b0"
SRC_URI[phf_shared-0.11.2.sha256sum] = "90fcb95eef784c2ac79119d1dd819e162b5da872ce6f3c3abe1e8ca1c082f72b"
SRC_URI[pin-project-lite-0.2.14.sha256sum] = "bda66fc9667c18cb2758a2ac84d1167245054bcf85d5d1aaa6923f45801bdd02"
SRC_URI[pkg-config-0.3.30.sha256sum] = "d231b230927b5e4ad203db57bbcbee2802f6bce620b1e4a9024a07d94e2907ec"
SRC_URI[portable-atomic-1.6.0.sha256sum] = "7170ef9988bc169ba16dd36a7fa041e5c4cbeb6a35b76d4c03daded371eae7c0"
SRC_URI[ppv-lite86-0.2.17.sha256sum] = "5b40af805b3121feab8a3c29f04d8ad262fa8e0561883e7653e024ae4479e6de"
SRC_URI[predicates-3.1.2.sha256sum] = "7e9086cc7640c29a356d1a29fd134380bee9d8f79a17410aa76e7ad295f42c97"
SRC_URI[predicates-core-1.0.8.sha256sum] = "ae8177bee8e75d6846599c6b9ff679ed51e882816914eec639944d7c9aa11931"
SRC_URI[predicates-tree-1.0.11.sha256sum] = "41b740d195ed3166cd147c8047ec98db0e22ec019eb8eeb76d343b795304fb13"
SRC_URI[pretty_assertions-1.4.1.sha256sum] = "3ae130e2f271fbc2ac3a40fb1d07180839cdbbe443c7a27e1e3c13c5cac0116d"
SRC_URI[proc-macro2-1.0.92.sha256sum] = "37d3544b3f2748c54e147655edb5025752e2303145b5aefb3c3ea2c78b973bb0"
SRC_URI[pyproject-toml-0.13.4.sha256sum] = "643af57c3f36ba90a8b53e972727d8092f7408a9ebfbaf4c3d2c17b07c58d835"
SRC_URI[quick-junit-0.5.1.sha256sum] = "3ed1a693391a16317257103ad06a88c6529ac640846021da7c435a06fffdacd7"
SRC_URI[quick-xml-0.37.1.sha256sum] = "f22f29bdff3987b4d8632ef95fd6424ec7e4e0a57e2f4fc63e489e75357f6a03"
SRC_URI[quickcheck-1.0.3.sha256sum] = "588f6378e4dd99458b60ec275b4477add41ce4fa9f64dcba6f15adccb19b50d6"
SRC_URI[quickcheck_macros-1.0.0.sha256sum] = "b22a693222d716a9587786f37ac3f6b4faedb5b80c23914e7303ff5a1d8016e9"
SRC_URI[quote-1.0.38.sha256sum] = "0e4dccaaaf89514f546c693ddc140f729f958c247918a13380cccc6078391acc"
SRC_URI[rand-0.8.5.sha256sum] = "34af8d1a0e25924bc5b7c43c079c942339d8f0a8b57c39049bef581b46327404"
SRC_URI[rand_chacha-0.3.1.sha256sum] = "e6c10a63a0fa32252be49d21e7709d4d4baf8d231c2dbce1eaa8141b9b127d88"
SRC_URI[rand_core-0.6.4.sha256sum] = "ec0be4795e2f6a28069bec0b5ff3e2ac9bafc99e6a9a7dc3547996c5c816922c"
SRC_URI[rayon-1.10.0.sha256sum] = "b418a60154510ca1a002a752ca9714984e21e4241e804d32555251faf8b78ffa"
SRC_URI[rayon-core-1.12.1.sha256sum] = "1465873a3dfdaa8ae7cb14b4383657caab0b3e8a0aa9ae8e04b044854c8dfce2"
SRC_URI[redox_syscall-0.4.1.sha256sum] = "4722d768eff46b75989dd134e5c353f0d6296e5aaa3132e776cbdb56be7731aa"
SRC_URI[redox_syscall-0.5.3.sha256sum] = "2a908a6e00f1fdd0dfd9c0eb08ce85126f6d8bbda50017e74bc4a4b7d4a926a4"
SRC_URI[redox_users-0.4.5.sha256sum] = "bd283d9651eeda4b2a83a43c1c91b266c40fd76ecd39a50a8c630ae69dc72891"
SRC_URI[regex-1.11.1.sha256sum] = "b544ef1b4eac5dc2db33ea63606ae9ffcfac26c1416a2806ae0bf5f56b201191"
SRC_URI[regex-automata-0.1.10.sha256sum] = "6c230d73fb8d8c1b9c0b3135c5142a8acee3a0558fb8db5cf1cb65f8d7862132"
SRC_URI[regex-automata-0.4.8.sha256sum] = "368758f23274712b504848e9d5a6f010445cc8b87a7cdb4d7cbee666c1288da3"
SRC_URI[regex-syntax-0.6.29.sha256sum] = "f162c6dd7b008981e4d40210aca20b4bd0f9b60ca9271061b07f78537722f2e1"
SRC_URI[regex-syntax-0.8.5.sha256sum] = "2b15c43186be67a4fd63bee50d0303afffcef381492ebe2c5d87f324e1b8815c"
SRC_URI[ring-0.17.8.sha256sum] = "c17fa4cb658e3583423e915b9f3acc01cceaee1860e33d59ebae66adc3a2dc0d"
SRC_URI[ron-0.7.1.sha256sum] = "88073939a61e5b7680558e6be56b419e208420c2adb92be54921fa6b72283f1a"
SRC_URI[rust-stemmers-1.2.0.sha256sum] = "e46a2036019fdb888131db7a4c847a1063a7493f971ed94ea82c67eada63ca54"
SRC_URI[rustc-hash-1.1.0.sha256sum] = "08d43f7aa6b08d49f382cde6a7982047c3426db949b1424bc4b7ec9ae12c6ce2"
SRC_URI[rustc-hash-2.1.0.sha256sum] = "c7fb8039b3032c191086b10f11f319a6e99e1e82889c5cc6046f515c9db1d497"
SRC_URI[rustix-0.38.40.sha256sum] = "99e4ea3e1cdc4b559b8e5650f9c8e5998e3e5c1343b4eaf034565f32318d63c0"
SRC_URI[rustls-0.23.19.sha256sum] = "934b404430bb06b3fae2cba809eb45a1ab1aecd64491213d7c3301b88393f8d1"
SRC_URI[rustls-pki-types-1.10.0.sha256sum] = "16f1201b3c9a7ee8039bcadc17b7e605e2945b27eee7631788c1bd2b0643674b"
SRC_URI[rustls-webpki-0.102.8.sha256sum] = "64ca1bc8749bd4cf37b5ce386cc146580777b4e8572c7b97baf22c83f444bee9"
SRC_URI[rustversion-1.0.15.sha256sum] = "80af6f9131f277a45a3fba6ce8e2258037bb0477a67e610d3c1fe046ab31de47"
SRC_URI[ryu-1.0.17.sha256sum] = "e86697c916019a8588c99b5fac3cead74ec0b4b819707a682fd4d23fa0ce1ba1"
SRC_URI[same-file-1.0.6.sha256sum] = "93fc1dc3aaa9bfed95e02e6eadabb4baf7e3078b0bd1b4d7b6b0b68378900502"
SRC_URI[schemars-0.8.21.sha256sum] = "09c024468a378b7e36765cd36702b7a90cc3cba11654f6685c8f233408e89e92"
SRC_URI[schemars_derive-0.8.21.sha256sum] = "b1eee588578aff73f856ab961cd2f79e36bc45d7ded33a7562adba4667aecc0e"
SRC_URI[scoped-tls-1.0.1.sha256sum] = "e1cf6437eb19a8f4a6cc0f7dca544973b0b78843adbfeb3683d1a94a0024a294"
SRC_URI[scopeguard-1.2.0.sha256sum] = "94143f37725109f92c262ed2cf5e59bce7498c01bcc1502d7b9afe439a4e9f49"
SRC_URI[seahash-4.1.0.sha256sum] = "1c107b6f4780854c8b126e228ea8869f4d7b71260f962fefb57b996b8959ba6b"
SRC_URI[serde-1.0.217.sha256sum] = "02fc4265df13d6fa1d00ecff087228cc0a2b5f3c0e87e258d8b94a156e984c70"
SRC_URI[serde-wasm-bindgen-0.6.5.sha256sum] = "8302e169f0eddcc139c70f139d19d6467353af16f9fce27e8c30158036a1e16b"
SRC_URI[serde_derive-1.0.217.sha256sum] = "5a9bf7cf98d04a2b28aead066b7496853d4779c9cc183c440dbac457641e19a0"
SRC_URI[serde_derive_internals-0.29.0.sha256sum] = "330f01ce65a3a5fe59a60c82f3c9a024b573b8a6e875bd233fe5f934e71d54e3"
SRC_URI[serde_json-1.0.134.sha256sum] = "d00f4175c42ee48b15416f6193a959ba3a0d67fc699a0db9ad12df9f83991c7d"
SRC_URI[serde_repr-0.1.19.sha256sum] = "6c64451ba24fc7a6a2d60fc75dd9c83c90903b19028d4eff35e88fc1e86564e9"
SRC_URI[serde_spanned-0.6.7.sha256sum] = "eb5b1b31579f3811bf615c144393417496f152e12ac8b7663bf664f4a815306d"
SRC_URI[serde_test-1.0.177.sha256sum] = "7f901ee573cab6b3060453d2d5f0bae4e6d628c23c0a962ff9b5f1d7c8d4f1ed"
SRC_URI[serde_with-3.12.0.sha256sum] = "d6b6f7f2fcb69f747921f79f3926bd1e203fce4fef62c268dd3abfb6d86029aa"
SRC_URI[serde_with_macros-3.12.0.sha256sum] = "8d00caa5193a3c8362ac2b73be6b9e768aa5a4b2f721d8f4b339600c3cb51f8e"
SRC_URI[sha2-0.10.8.sha256sum] = "793db75ad2bcafc3ffa7c68b215fee268f537982cd901d132f89c6343f3a3dc8"
SRC_URI[sharded-slab-0.1.7.sha256sum] = "f40ca3c46823713e0d4209592e8d6e826aa57e928f09752619fc696c499637f6"
SRC_URI[shellexpand-3.1.0.sha256sum] = "da03fa3b94cc19e3ebfc88c4229c49d8f08cdbd1228870a45f0ffdf84988e14b"
SRC_URI[shlex-1.3.0.sha256sum] = "0fda2ff0d084019ba4d7c6f371c95d8fd75ce3524c3cb8fb653a3023f6323e64"
SRC_URI[similar-2.6.0.sha256sum] = "1de1d4f81173b03af4c0cbed3c898f6bff5b870e4a7f5d6f4057d62a7a4b686e"
SRC_URI[siphasher-0.3.11.sha256sum] = "38b58827f4464d87d377d175e90bf58eb00fd8716ff0a62f80356b5e61555d0d"
SRC_URI[smallvec-1.13.2.sha256sum] = "3c5e1a9a646d36c3599cd173a41282daf47c44583ad367b8e6837255952e5c67"
SRC_URI[spin-0.9.8.sha256sum] = "6980e8d7511241f8acf4aebddbb1ff938df5eebe98691418c4468d0b72a96a67"
SRC_URI[stable_deref_trait-1.2.0.sha256sum] = "a8f112729512f8e442d81f95a8a7ddf2b7c6b8a1a6f509a95864142b30cab2d3"
SRC_URI[static_assertions-1.1.0.sha256sum] = "a2eb9349b6444b326872e140eb1cf5e7c522154d69e7a0ffb0fb81c06b37543f"
SRC_URI[strip-ansi-escapes-0.2.0.sha256sum] = "55ff8ef943b384c414f54aefa961dd2bd853add74ec75e7ac74cf91dba62bcfa"
SRC_URI[strsim-0.10.0.sha256sum] = "73473c0e59e6d5812c5dfe2a064a6444949f089e20eec9a2e5506596494e4623"
SRC_URI[strsim-0.11.1.sha256sum] = "7da8b5736845d9f2fcb837ea5d9e2628564b3b043a70948a3f0b778838c5fb4f"
SRC_URI[strum-0.26.3.sha256sum] = "8fec0f0aef304996cf250b31b5a10dee7980c85da9d759361292b8bca5a18f06"
SRC_URI[strum_macros-0.26.4.sha256sum] = "4c6bee85a5a24955dc440386795aa378cd9cf82acd5f764469152d2270e581be"
SRC_URI[subtle-2.5.0.sha256sum] = "81cdd64d312baedb58e21336b31bc043b77e01cc99033ce76ef539f78e965ebc"
SRC_URI[syn-1.0.109.sha256sum] = "72b64191b275b66ffe2469e8af2c1cfe3bafa67b529ead792a6d0160888b4237"
SRC_URI[syn-2.0.93.sha256sum] = "9c786062daee0d6db1132800e623df74274a0a87322d8e183338e01b3d98d058"
SRC_URI[synstructure-0.13.1.sha256sum] = "c8af7666ab7b6390ab78131fb5b0fce11d6b7a6951602017c35fa82800708971"
SRC_URI[tempfile-3.14.0.sha256sum] = "28cce251fcbc87fac86a866eeb0d6c2d536fc16d06f184bb61aeae11aa4cee0c"
SRC_URI[terminal_size-0.4.0.sha256sum] = "4f599bd7ca042cfdf8f4512b277c02ba102247820f9d9d4a9f521f496751a6ef"
SRC_URI[terminfo-0.8.0.sha256sum] = "666cd3a6681775d22b200409aad3b089c5b99fb11ecdd8a204d9d62f8148498f"
SRC_URI[termtree-0.4.1.sha256sum] = "3369f5ac52d5eb6ab48c6b4ffdc8efbcad6b89c765749064ba298f2c68a16a76"
SRC_URI[test-case-3.3.1.sha256sum] = "eb2550dd13afcd286853192af8601920d959b14c401fcece38071d53bf0768a8"
SRC_URI[test-case-core-3.3.1.sha256sum] = "adcb7fd841cd518e279be3d5a3eb0636409487998a4aff22f3de87b81e88384f"
SRC_URI[test-case-macros-3.3.1.sha256sum] = "5c89e72a01ed4c579669add59014b9a524d609c0c88c6a585ce37485879f6ffb"
SRC_URI[thiserror-1.0.67.sha256sum] = "3b3c6efbfc763e64eb85c11c25320f0737cb7364c4b6336db90aa9ebe27a0bbd"
SRC_URI[thiserror-2.0.9.sha256sum] = "f072643fd0190df67a8bab670c20ef5d8737177d6ac6b2e9a236cb096206b2cc"
SRC_URI[thiserror-impl-1.0.67.sha256sum] = "b607164372e89797d78b8e23a6d67d5d1038c1c65efd52e1389ef8b77caba2a6"
SRC_URI[thiserror-impl-2.0.9.sha256sum] = "7b50fa271071aae2e6ee85f842e2e28ba8cd2c5fb67f11fcb1fd70b276f9e7d4"
SRC_URI[thread_local-1.1.8.sha256sum] = "8b9ef9bad013ada3808854ceac7b46812a6465ba368859a37e2100283d2d719c"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[tikv-jemallocator-0.6.0.sha256sum] = "4cec5ff18518d81584f477e9bfdf957f5bb0979b0bac3af4ca30b5b3ae2d2865"
SRC_URI[tinystr-0.7.6.sha256sum] = "9117f5d4db391c1cf6927e7bea3db74b9a1c1add8f7eda9ffd5364f40f57b82f"
SRC_URI[tinytemplate-1.2.1.sha256sum] = "be4d6b5f19ff7664e8c98d03e2139cb510db9b0a60b55f8e8709b689d939b6bc"
SRC_URI[tinyvec-1.6.0.sha256sum] = "87cc5ceb3875bb20c2890005a4e226a4651264a5c75edb2421b52861a0a0cb50"
SRC_URI[tinyvec_macros-0.1.1.sha256sum] = "1f3ccbac311fea05f86f61904b462b55fb3df8837a366dfc601a0161d0532f20"
SRC_URI[toml-0.8.19.sha256sum] = "a1ed1f98e3fdc28d6d910e6737ae6ab1a93bf1985935a1193e68f93eeb68d24e"
SRC_URI[toml_datetime-0.6.8.sha256sum] = "0dd7358ecb8fc2f8d014bf86f6f638ce72ba252a2c3a2572f2a795f1d23efb41"
SRC_URI[toml_edit-0.22.20.sha256sum] = "583c44c02ad26b0c3f3066fe629275e50627026c51ac2e595cca4c230ce1ce1d"
SRC_URI[tracing-0.1.41.sha256sum] = "784e0ac535deb450455cbfa28a6f0df145ea1bb7ae51b821cf5e7927fdcfbdd0"
SRC_URI[tracing-attributes-0.1.28.sha256sum] = "395ae124c09f9e6918a2310af6038fba074bcf474ac352496d5910dd59a2226d"
SRC_URI[tracing-core-0.1.33.sha256sum] = "e672c95779cf947c5311f83787af4fa8fffd12fb27e4993211a84bdfd9610f9c"
SRC_URI[tracing-flame-0.2.0.sha256sum] = "0bae117ee14789185e129aaee5d93750abe67fdc5a9a62650452bfe4e122a3a9"
SRC_URI[tracing-indicatif-0.3.8.sha256sum] = "74ba258e9de86447f75edf6455fded8e5242704c6fccffe7bf8d7fb6daef1180"
SRC_URI[tracing-log-0.2.0.sha256sum] = "ee855f1f400bd0e5c02d150ae5de3840039a3f54b025156404e34c23c03f47c3"
SRC_URI[tracing-subscriber-0.3.19.sha256sum] = "e8189decb5ac0fa7bc8b96b7cb9b2701d60d48805aca84a238004d665fcc4008"
SRC_URI[tracing-tree-0.4.0.sha256sum] = "f459ca79f1b0d5f71c54ddfde6debfc59c8b6eeb46808ae492077f739dc7b49c"
SRC_URI[typed-arena-2.0.2.sha256sum] = "6af6ae20167a9ece4bcb41af5b80f8a1f1df981f6391189ce00fd257af04126a"
SRC_URI[typenum-1.17.0.sha256sum] = "42ff0bf0c66b8238c6f3b578df37d0b7848e55df8577b3f74f92a69acceeb825"
SRC_URI[ucd-trie-0.1.6.sha256sum] = "ed646292ffc8188ef8ea4d1e0e0150fb15a5c2e12ad9b8fc191ae7a8a7f3c4b9"
SRC_URI[unic-char-property-0.9.0.sha256sum] = "a8c57a407d9b6fa02b4795eb81c5b6652060a15a7903ea981f3d723e6c0be221"
SRC_URI[unic-char-range-0.9.0.sha256sum] = "0398022d5f700414f6b899e10b8348231abf9173fa93144cbc1a43b9793c1fbc"
SRC_URI[unic-common-0.9.0.sha256sum] = "80d7ff825a6a654ee85a63e80f92f054f904f21e7d12da4e22f9834a4aaa35bc"
SRC_URI[unic-ucd-category-0.9.0.sha256sum] = "1b8d4591f5fcfe1bd4453baaf803c40e1b1e69ff8455c47620440b46efef91c0"
SRC_URI[unic-ucd-version-0.9.0.sha256sum] = "96bd2f2237fe450fcd0a1d2f5f4e91711124f7857ba2e964247776ebeeb7b0c4"
SRC_URI[unicode-ident-1.0.14.sha256sum] = "adb9e6ca4f869e1180728b7950e35922a7fc6397f7b641499e8f3ef06e50dc83"
SRC_URI[unicode-normalization-0.1.24.sha256sum] = "5033c97c4262335cded6d6fc3e5c18ab755e1a3dc96376350f3d8e9f009ad956"
SRC_URI[unicode-width-0.1.13.sha256sum] = "0336d538f7abc86d282a4189614dfaa90810dfc2c6f6427eaf88e16311dd225d"
SRC_URI[unicode-width-0.2.0.sha256sum] = "1fc81956842c57dac11422a97c3b8195a1ff727f06e85c84ed2e8aa277c9a0fd"
SRC_URI[unicode_names2-1.3.0.sha256sum] = "d1673eca9782c84de5f81b82e4109dcfb3611c8ba0d52930ec4a9478f547b2dd"
SRC_URI[unicode_names2_generator-1.3.0.sha256sum] = "b91e5b84611016120197efd7dc93ef76774f4e084cd73c9fb3ea4a86c570c56e"
SRC_URI[unscanny-0.1.0.sha256sum] = "e9df2af067a7953e9c3831320f35c1cc0600c30d44d9f7a12b01db1cd88d6b47"
SRC_URI[untrusted-0.9.0.sha256sum] = "8ecb6da28b8a351d773b68d5825ac39017e680750f980f3a1a85cd8dd28a47c1"
SRC_URI[ureq-2.12.1.sha256sum] = "02d1a66277ed75f640d608235660df48c8e3c19f3b4edb6a263315626cc3c01d"
SRC_URI[url-2.5.4.sha256sum] = "32f8b686cadd1473f4bd0117a5d28d36b1ade384ea9b5069a1c40aefed7fda60"
SRC_URI[urlencoding-2.1.3.sha256sum] = "daf8dba3b7eb870caf1ddeed7bc9d2a049f3cfdfae7cb521b087cc33ae4c49da"
SRC_URI[utf16_iter-1.0.5.sha256sum] = "c8232dd3cdaed5356e0f716d285e4b40b932ac434100fe9b7e0e8e935b9e6246"
SRC_URI[utf8_iter-1.0.4.sha256sum] = "b6c140620e7ffbb22c2dee59cafe6084a59b5ffc27a8859a5f0d494b5d52b6be"
SRC_URI[utf8parse-0.2.1.sha256sum] = "711b9620af191e0cdc7468a8d14e709c3dcdb115b36f838e601583af800a370a"
SRC_URI[uuid-1.11.0.sha256sum] = "f8c5f0a0af699448548ad1a2fbf920fb4bee257eae39953ba95cb84891a0446a"
SRC_URI[uuid-macro-internal-1.11.0.sha256sum] = "6b91f57fe13a38d0ce9e28a03463d8d3c2468ed03d75375110ec71d93b449a08"
SRC_URI[valuable-0.1.0.sha256sum] = "830b7e5d4d90034032940e4ace0d9a9a057e7a45cd94e6c007832e39edb82f6d"
SRC_URI[version-ranges-0.1.1.sha256sum] = "f8d079415ceb2be83fc355adbadafe401307d5c309c7e6ade6638e6f9f42f42d"
SRC_URI[version_check-0.9.4.sha256sum] = "49874b5167b65d7193b8aba1567f5c7d93d001cafc34600cee003eda787e483f"
SRC_URI[vt100-0.15.2.sha256sum] = "84cd863bf0db7e392ba3bd04994be3473491b31e66340672af5d11943c6274de"
SRC_URI[vte-0.11.1.sha256sum] = "f5022b5fbf9407086c180e9557be968742d839e68346af7792b8592489732197"
SRC_URI[vte_generate_state_changes-0.1.1.sha256sum] = "d257817081c7dffcdbab24b9e62d2def62e2ff7d00b1c20062551e6cccc145ff"
SRC_URI[walkdir-2.5.0.sha256sum] = "29790946404f91d9c5d06f9874efddea1dc06c5efe94541a7d6863108e3a5e4b"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasm-bindgen-0.2.97.sha256sum] = "d15e63b4482863c109d70a7b8706c1e364eb6ea449b201a76c5b89cedcec2d5c"
SRC_URI[wasm-bindgen-backend-0.2.97.sha256sum] = "8d36ef12e3aaca16ddd3f67922bc63e48e953f126de60bd33ccc0101ef9998cd"
SRC_URI[wasm-bindgen-futures-0.4.47.sha256sum] = "9dfaf8f50e5f293737ee323940c7d8b08a66a95a419223d9f41610ca08b0833d"
SRC_URI[wasm-bindgen-macro-0.2.97.sha256sum] = "705440e08b42d3e4b36de7d66c944be628d579796b8090bfa3471478a2260051"
SRC_URI[wasm-bindgen-macro-support-0.2.97.sha256sum] = "98c9ae5a76e46f4deecd0f0255cc223cfa18dc9b261213b8aa0c7b36f61b3f1d"
SRC_URI[wasm-bindgen-shared-0.2.97.sha256sum] = "6ee99da9c5ba11bd675621338ef6fa52296b76b83305e9b6e5c77d4c286d6d49"
SRC_URI[wasm-bindgen-test-0.3.47.sha256sum] = "3d919bb60ebcecb9160afee6c71b43a58a4f0517a2de0054cd050d02cec08201"
SRC_URI[wasm-bindgen-test-macro-0.3.47.sha256sum] = "222ebde6ea87fbfa6bdd2e9f1fd8a91d60aee5db68792632176c4e16a74fc7d8"
SRC_URI[web-sys-0.3.74.sha256sum] = "a98bc3c33f0fe7e59ad7cd041b89034fa82a7c2d4365ca538dda6cdaf513863c"
SRC_URI[web-time-1.1.0.sha256sum] = "5a6580f308b1fad9207618087a65c04e7a10bc77e02c8e84e9b00dd4b12fa0bb"
SRC_URI[webpki-roots-0.26.1.sha256sum] = "b3de34ae270483955a94f4b21bdaaeb83d508bb84a01435f393818edb0012009"
SRC_URI[which-6.0.1.sha256sum] = "8211e4f58a2b2805adfbefbc07bab82958fc91e3836339b1ab7ae32465dce0d7"
SRC_URI[wild-2.2.1.sha256sum] = "a3131afc8c575281e1e80f36ed6a092aa502c08b18ed7524e86fbbb12bb410e1"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.8.sha256sum] = "4d4cc384e1e73b93bafa6fb4f1df8c41695c8a91cf9c4c64358067d15a7b6c6b"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[windows-core-0.52.0.sha256sum] = "33ab640c8d7e35bf8ba19b884ba838ceb4fba93a4e8c65a9059d08afcfc683d9"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-sys-0.52.0.sha256sum] = "282be5f36a8ce781fad8c8ae18fa3f9beff57ec1b52cb3de0789201425d9a33d"
SRC_URI[windows-sys-0.59.0.sha256sum] = "1e38bc4d79ed67fd075bcc251a1c39b32a1776bbe92e5bef1f0bf1f8c531853b"
SRC_URI[windows-targets-0.48.5.sha256sum] = "9a2fa6e2155d7247be68c096456083145c183cbbbc2764150dda45a87197940c"
SRC_URI[windows-targets-0.52.6.sha256sum] = "9b724f72796e036ab90c1021d4780d4d3d648aca59e491e6b98e725b84e99973"
SRC_URI[windows_aarch64_gnullvm-0.48.5.sha256sum] = "2b38e32f0abccf9987a4e3079dfb67dcd799fb61361e53e2882c3cbaf0d905d8"
SRC_URI[windows_aarch64_gnullvm-0.52.6.sha256sum] = "32a4622180e7a0ec044bb555404c800bc9fd9ec262ec147edd5989ccd0c02cd3"
SRC_URI[windows_aarch64_msvc-0.48.5.sha256sum] = "dc35310971f3b2dbbf3f0690a219f40e2d9afcf64f9ab7cc1be722937c26b4bc"
SRC_URI[windows_aarch64_msvc-0.52.6.sha256sum] = "09ec2a7bb152e2252b53fa7803150007879548bc709c039df7627cabbd05d469"
SRC_URI[windows_i686_gnu-0.48.5.sha256sum] = "a75915e7def60c94dcef72200b9a8e58e5091744960da64ec734a6c6e9b3743e"
SRC_URI[windows_i686_gnu-0.52.6.sha256sum] = "8e9b5ad5ab802e97eb8e295ac6720e509ee4c243f69d781394014ebfe8bbfa0b"
SRC_URI[windows_i686_gnullvm-0.52.6.sha256sum] = "0eee52d38c090b3caa76c563b86c3a4bd71ef1a819287c19d586d7334ae8ed66"
SRC_URI[windows_i686_msvc-0.48.5.sha256sum] = "8f55c233f70c4b27f66c523580f78f1004e8b5a8b659e05a4eb49d4166cca406"
SRC_URI[windows_i686_msvc-0.52.6.sha256sum] = "240948bc05c5e7c6dabba28bf89d89ffce3e303022809e73deaefe4f6ec56c66"
SRC_URI[windows_x86_64_gnu-0.48.5.sha256sum] = "53d40abd2583d23e4718fddf1ebec84dbff8381c07cae67ff7768bbf19c6718e"
SRC_URI[windows_x86_64_gnu-0.52.6.sha256sum] = "147a5c80aabfbf0c7d901cb5895d1de30ef2907eb21fbbab29ca94c5b08b1a78"
SRC_URI[windows_x86_64_gnullvm-0.48.5.sha256sum] = "0b7b52767868a23d5bab768e390dc5f5c55825b6d30b86c844ff2dc7414044cc"
SRC_URI[windows_x86_64_gnullvm-0.52.6.sha256sum] = "24d5b23dc417412679681396f2b49f3de8c1473deb516bd34410872eff51ed0d"
SRC_URI[windows_x86_64_msvc-0.48.5.sha256sum] = "ed94fce61571a4006852b7389a063ab983c02eb1bb37b47f8272ce92d06d9538"
SRC_URI[windows_x86_64_msvc-0.52.6.sha256sum] = "589f6da84c646204747d1270a2a5661ea66ed1cced2631d546fdfb155959f9ec"
SRC_URI[winnow-0.6.18.sha256sum] = "68a9bda4691f099d435ad181000724da8e5899daa10713c2d432552b9ccd3a6f"
SRC_URI[winsafe-0.0.19.sha256sum] = "d135d17ab770252ad95e9a872d365cf3090e3be864a34ab46f48555993efc904"
SRC_URI[write16-1.0.0.sha256sum] = "d1890f4022759daae28ed4fe62859b1236caebfc61ede2f63ed4e695f3f6d936"
SRC_URI[writeable-0.5.5.sha256sum] = "1e9df38ee2d2c3c5948ea468a8406ff0db0b29ae1ffde1bcf20ef305bcc95c51"
SRC_URI[yansi-1.0.1.sha256sum] = "cfe53a6657fd280eaa890a3bc59152892ffa3e30101319d168b781ed6529b049"
SRC_URI[yansi-term-0.1.2.sha256sum] = "fe5c30ade05e61656247b2e334a031dfd0cc466fadef865bdcdea8d537951bf1"
SRC_URI[yoke-0.7.4.sha256sum] = "6c5b1314b079b0930c31e3af543d8ee1757b1951ae1e1565ec704403a7240ca5"
SRC_URI[yoke-derive-0.7.4.sha256sum] = "28cc31741b18cb6f1d5ff12f5b7523e3d6eb0852bbbad19d73905511d9849b95"
SRC_URI[zerocopy-0.7.32.sha256sum] = "74d4d3961e53fa4c9a25a8637fc2bfaf2595b3d3ae34875568a5cf64787716be"
SRC_URI[zerocopy-derive-0.7.32.sha256sum] = "9ce1b18ccd8e73a9321186f97e46f9f04b778851177567b1975109d26a08d2a6"
SRC_URI[zerofrom-0.1.4.sha256sum] = "91ec111ce797d0e0784a1116d0ddcdbea84322cd79e5d5ad173daeba4f93ab55"
SRC_URI[zerofrom-derive-0.1.4.sha256sum] = "0ea7b4a3637ea8669cedf0f1fd5c286a17f3de97b8dd5a70a6c167a1730e63a5"
SRC_URI[zeroize-1.7.0.sha256sum] = "525b4ec142c6b68a2d10f01f7bbf6755599ca3f81ea53b8431b7dd348f5fdb2d"
SRC_URI[zerovec-0.10.4.sha256sum] = "aa2b893d79df23bfb12d5461018d408ea19dfafe76c2c7ef6d4eba614f8ff079"
SRC_URI[zerovec-derive-0.10.3.sha256sum] = "6eafa6dfb17584ea3e2bd6e76e0cc15ad7af12b09abdd1ca55961bed9b1063c6"
SRC_URI[zip-0.6.6.sha256sum] = "760394e246e4c28189f19d488c058bf16f564016aefac5d32bb1f3b51d5e9261"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"

SRCREV_FORMAT = "--astral-sh-lsp-types.git--salsa-rs-salsa.git"
inherit sca-description
inherit cargo-fixups
inherit pypi
inherit python_maturin
inherit_defer native

# until we figured out how to trick cargo from bitbake
# to NOT ******** attempt to refresh git dependencies
# we need to enable networking in compile
do_compile[network] = "1"

SRC_URI:append = " ${CRATES_LIST}"

SCA_TOOL_DESCRIPTION = "ruff"

INSANE_SKIP:${PN} += "already-stripped"