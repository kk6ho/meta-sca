SUMMARY = "An extremely fast Python linter"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=74857962302335464089f7fa566b7a14"

PYPI_PACKAGE = "ruff"

CRATES_LIST = "\
    crate://crates.io/Inflector/0.11.4 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/ahash/0.8.11 \
    crate://crates.io/aho-corasick/1.1.3 \
    crate://crates.io/allocator-api2/0.2.16 \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/anes/0.1.6 \
    crate://crates.io/annotate-snippets/0.6.1 \
    crate://crates.io/annotate-snippets/0.9.2 \
    crate://crates.io/anstream/0.6.13 \
    crate://crates.io/anstyle-parse/0.2.3 \
    crate://crates.io/anstyle-query/1.0.2 \
    crate://crates.io/anstyle-wincon/3.0.2 \
    crate://crates.io/anstyle/1.0.6 \
    crate://crates.io/anyhow/1.0.82 \
    crate://crates.io/argfile/0.2.0 \
    crate://crates.io/arrayvec/0.7.4 \
    crate://crates.io/autocfg/1.2.0 \
    crate://crates.io/base64/0.22.0 \
    crate://crates.io/bincode/1.3.3 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.5.0 \
    crate://crates.io/bstr/1.9.1 \
    crate://crates.io/bumpalo/3.16.0 \
    crate://crates.io/cachedir/0.3.1 \
    crate://crates.io/cast/0.3.0 \
    crate://crates.io/cc/1.0.95 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/cfg_aliases/0.1.1 \
    crate://crates.io/chic/1.2.2 \
    crate://crates.io/chrono/0.4.38 \
    crate://crates.io/ciborium-io/0.2.2 \
    crate://crates.io/ciborium-ll/0.2.2 \
    crate://crates.io/ciborium/0.2.2 \
    crate://crates.io/clap/4.5.4 \
    crate://crates.io/clap_builder/4.5.2 \
    crate://crates.io/clap_complete/4.5.2 \
    crate://crates.io/clap_complete_command/0.5.1 \
    crate://crates.io/clap_complete_fig/4.5.0 \
    crate://crates.io/clap_complete_nushell/0.1.11 \
    crate://crates.io/clap_derive/4.5.4 \
    crate://crates.io/clap_lex/0.7.0 \
    crate://crates.io/clearscreen/3.0.0 \
    crate://crates.io/codspeed-criterion-compat/2.6.0 \
    crate://crates.io/codspeed/2.6.0 \
    crate://crates.io/colorchoice/1.0.0 \
    crate://crates.io/colored/2.1.0 \
    crate://crates.io/console/0.15.8 \
    crate://crates.io/console_error_panic_hook/0.1.7 \
    crate://crates.io/console_log/1.0.0 \
    crate://crates.io/core-foundation-sys/0.8.6 \
    crate://crates.io/countme/3.0.1 \
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
    crate://crates.io/ctrlc/3.4.4 \
    crate://crates.io/darling/0.20.8 \
    crate://crates.io/darling_core/0.20.8 \
    crate://crates.io/darling_macro/0.20.8 \
    crate://crates.io/dashmap/5.5.3 \
    crate://crates.io/diff/0.1.13 \
    crate://crates.io/dirs-sys/0.3.7 \
    crate://crates.io/dirs-sys/0.4.1 \
    crate://crates.io/dirs/4.0.0 \
    crate://crates.io/dirs/5.0.1 \
    crate://crates.io/drop_bomb/0.1.5 \
    crate://crates.io/dyn-clone/1.0.17 \
    crate://crates.io/either/1.11.0 \
    crate://crates.io/encode_unicode/0.3.6 \
    crate://crates.io/env_filter/0.1.0 \
    crate://crates.io/env_logger/0.11.3 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/errno/0.3.8 \
    crate://crates.io/fastrand/2.0.2 \
    crate://crates.io/fern/0.6.2 \
    crate://crates.io/filetime/0.2.23 \
    crate://crates.io/flate2/1.0.28 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/form_urlencoded/1.2.1 \
    crate://crates.io/fs-err/2.11.0 \
    crate://crates.io/fsevent-sys/4.1.0 \
    crate://crates.io/getopts/0.2.21 \
    crate://crates.io/getrandom/0.2.14 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/globset/0.4.14 \
    crate://crates.io/half/2.4.1 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/hashbrown/0.14.5 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/heck/0.5.0 \
    crate://crates.io/hermit-abi/0.3.9 \
    crate://crates.io/hexf-parse/0.2.1 \
    crate://crates.io/home/0.5.9 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/iana-time-zone/0.1.60 \
    crate://crates.io/ident_case/1.0.1 \
    crate://crates.io/idna/0.5.0 \
    crate://crates.io/ignore/0.4.22 \
    crate://crates.io/imara-diff/0.1.5 \
    crate://crates.io/imperative/1.0.5 \
    crate://crates.io/indexmap/2.2.6 \
    crate://crates.io/indicatif/0.17.8 \
    crate://crates.io/indoc/2.0.5 \
    crate://crates.io/inotify-sys/0.1.5 \
    crate://crates.io/inotify/0.9.6 \
    crate://crates.io/insta-cmd/0.6.0 \
    crate://crates.io/insta/1.38.0 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/is-docker/0.2.0 \
    crate://crates.io/is-macro/0.3.5 \
    crate://crates.io/is-terminal/0.4.12 \
    crate://crates.io/is-wsl/0.4.0 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itertools/0.12.1 \
    crate://crates.io/itoa/1.0.11 \
    crate://crates.io/jod-thread/0.1.2 \
    crate://crates.io/js-sys/0.3.69 \
    crate://crates.io/kqueue-sys/1.0.4 \
    crate://crates.io/kqueue/1.0.8 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lexical-parse-float/0.8.5 \
    crate://crates.io/lexical-parse-integer/0.8.6 \
    crate://crates.io/lexical-util/0.8.5 \
    crate://crates.io/libc/0.2.154 \
    crate://crates.io/libcst/1.3.1 \
    crate://crates.io/libcst_derive/1.3.1 \
    crate://crates.io/libmimalloc-sys/0.1.37 \
    crate://crates.io/libredox/0.1.3 \
    crate://crates.io/linked-hash-map/0.5.6 \
    crate://crates.io/linux-raw-sys/0.4.13 \
    crate://crates.io/lock_api/0.4.11 \
    crate://crates.io/log/0.4.21 \
    crate://crates.io/lsp-server/0.7.6 \
    crate://crates.io/lsp-types/0.95.1 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/matches/0.1.10 \
    crate://crates.io/matchit/0.8.2 \
    crate://crates.io/memchr/2.7.2 \
    crate://crates.io/mimalloc/0.1.41 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.7.2 \
    crate://crates.io/mio/0.8.11 \
    crate://crates.io/natord/1.0.9 \
    crate://crates.io/newtype-uuid/1.1.0 \
    crate://crates.io/nix/0.28.0 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/notify/6.1.1 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/nu-ansi-term/0.49.0 \
    crate://crates.io/num-traits/0.2.18 \
    crate://crates.io/number_prefix/0.4.0 \
    crate://crates.io/once_cell/1.19.0 \
    crate://crates.io/oorandom/11.1.3 \
    crate://crates.io/option-ext/0.2.0 \
    crate://crates.io/os_str_bytes/6.6.1 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/parking_lot/0.12.2 \
    crate://crates.io/parking_lot_core/0.9.9 \
    crate://crates.io/paste/1.0.14 \
    crate://crates.io/path-absolutize/3.1.1 \
    crate://crates.io/path-dedot/3.1.1 \
    crate://crates.io/path-slash/0.2.1 \
    crate://crates.io/pathdiff/0.2.1 \
    crate://crates.io/peg-macros/0.8.2 \
    crate://crates.io/peg-runtime/0.8.2 \
    crate://crates.io/peg/0.8.2 \
    crate://crates.io/pep440_rs/0.4.0 \
    crate://crates.io/pep440_rs/0.6.0 \
    crate://crates.io/pep508_rs/0.3.0 \
    crate://crates.io/percent-encoding/2.3.1 \
    crate://crates.io/phf/0.11.2 \
    crate://crates.io/phf_codegen/0.11.2 \
    crate://crates.io/phf_generator/0.11.2 \
    crate://crates.io/phf_shared/0.11.2 \
    crate://crates.io/pin-project-lite/0.2.14 \
    crate://crates.io/pmutil/0.6.1 \
    crate://crates.io/portable-atomic/1.6.0 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/pretty_assertions/1.4.0 \
    crate://crates.io/proc-macro2/1.0.81 \
    crate://crates.io/pyproject-toml/0.9.0 \
    crate://crates.io/quick-junit/0.4.0 \
    crate://crates.io/quick-xml/0.31.0 \
    crate://crates.io/quote/1.0.36 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rayon-core/1.12.1 \
    crate://crates.io/rayon/1.10.0 \
    crate://crates.io/redox_syscall/0.4.1 \
    crate://crates.io/redox_users/0.4.5 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-automata/0.4.6 \
    crate://crates.io/regex-syntax/0.6.29 \
    crate://crates.io/regex-syntax/0.8.3 \
    crate://crates.io/regex/1.10.4 \
    crate://crates.io/result-like-derive/0.5.0 \
    crate://crates.io/result-like/0.5.0 \
    crate://crates.io/ring/0.17.8 \
    crate://crates.io/rust-stemmers/1.2.0 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustix/0.38.34 \
    crate://crates.io/rustls-pki-types/1.5.0 \
    crate://crates.io/rustls-webpki/0.102.3 \
    crate://crates.io/rustls/0.22.4 \
    crate://crates.io/rustversion/1.0.15 \
    crate://crates.io/ryu/1.0.17 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/schemars/0.8.17 \
    crate://crates.io/schemars_derive/0.8.17 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/seahash/4.1.0 \
    crate://crates.io/serde-wasm-bindgen/0.6.5 \
    crate://crates.io/serde/1.0.200 \
    crate://crates.io/serde_derive/1.0.200 \
    crate://crates.io/serde_derive_internals/0.29.0 \
    crate://crates.io/serde_json/1.0.116 \
    crate://crates.io/serde_repr/0.1.19 \
    crate://crates.io/serde_spanned/0.6.5 \
    crate://crates.io/serde_test/1.0.176 \
    crate://crates.io/serde_with/3.8.1 \
    crate://crates.io/serde_with_macros/3.8.1 \
    crate://crates.io/sharded-slab/0.1.7 \
    crate://crates.io/shellexpand/3.1.0 \
    crate://crates.io/similar/2.5.0 \
    crate://crates.io/siphasher/0.3.11 \
    crate://crates.io/smallvec/1.13.2 \
    crate://crates.io/smawk/0.3.2 \
    crate://crates.io/smol_str/0.2.1 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strip-ansi-escapes/0.2.0 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/strsim/0.11.1 \
    crate://crates.io/strum/0.26.2 \
    crate://crates.io/strum_macros/0.26.2 \
    crate://crates.io/subtle/2.5.0 \
    crate://crates.io/syn/2.0.60 \
    crate://crates.io/tempfile/3.10.1 \
    crate://crates.io/terminal_size/0.3.0 \
    crate://crates.io/terminfo/0.8.0 \
    crate://crates.io/test-case-core/3.3.1 \
    crate://crates.io/test-case-macros/3.3.1 \
    crate://crates.io/test-case/3.3.1 \
    crate://crates.io/textwrap/0.16.1 \
    crate://crates.io/thiserror-impl/1.0.59 \
    crate://crates.io/thiserror/1.0.59 \
    crate://crates.io/thread_local/1.1.8 \
    crate://crates.io/tikv-jemalloc-sys/0.5.4+5.3.0-patched \
    crate://crates.io/tikv-jemallocator/0.5.4 \
    crate://crates.io/tinytemplate/1.2.1 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/toml/0.8.12 \
    crate://crates.io/toml_datetime/0.6.5 \
    crate://crates.io/toml_edit/0.22.12 \
    crate://crates.io/tracing-attributes/0.1.27 \
    crate://crates.io/tracing-core/0.1.32 \
    crate://crates.io/tracing-indicatif/0.3.6 \
    crate://crates.io/tracing-log/0.2.0 \
    crate://crates.io/tracing-subscriber/0.3.18 \
    crate://crates.io/tracing-tree/0.3.0 \
    crate://crates.io/tracing/0.1.40 \
    crate://crates.io/typed-arena/2.0.2 \
    crate://crates.io/unic-char-property/0.9.0 \
    crate://crates.io/unic-char-range/0.9.0 \
    crate://crates.io/unic-common/0.9.0 \
    crate://crates.io/unic-ucd-category/0.9.0 \
    crate://crates.io/unic-ucd-version/0.9.0 \
    crate://crates.io/unicode-bidi/0.3.15 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/unicode-linebreak/0.1.5 \
    crate://crates.io/unicode-normalization/0.1.23 \
    crate://crates.io/unicode-width/0.1.11 \
    crate://crates.io/unicode_names2/1.2.2 \
    crate://crates.io/unicode_names2_generator/1.2.2 \
    crate://crates.io/unscanny/0.1.0 \
    crate://crates.io/untrusted/0.9.0 \
    crate://crates.io/ureq/2.9.7 \
    crate://crates.io/url/2.5.0 \
    crate://crates.io/utf8parse/0.2.1 \
    crate://crates.io/uuid-macro-internal/1.8.0 \
    crate://crates.io/uuid/1.8.0 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/vt100/0.15.2 \
    crate://crates.io/vte/0.11.1 \
    crate://crates.io/vte_generate_state_changes/0.1.1 \
    crate://crates.io/walkdir/2.5.0 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.92 \
    crate://crates.io/wasm-bindgen-futures/0.4.42 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.92 \
    crate://crates.io/wasm-bindgen-macro/0.2.92 \
    crate://crates.io/wasm-bindgen-shared/0.2.92 \
    crate://crates.io/wasm-bindgen-test-macro/0.3.42 \
    crate://crates.io/wasm-bindgen-test/0.3.42 \
    crate://crates.io/wasm-bindgen/0.2.92 \
    crate://crates.io/web-sys/0.3.69 \
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
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows-targets/0.52.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.5 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.5 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.52.5 \
    crate://crates.io/windows_i686_gnullvm/0.52.5 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.52.5 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.52.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.5 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.52.5 \
    crate://crates.io/winnow/0.6.6 \
    crate://crates.io/winsafe/0.0.19 \
    crate://crates.io/yansi-term/0.1.2 \
    crate://crates.io/yansi/0.5.1 \
    crate://crates.io/zerocopy-derive/0.7.32 \
    crate://crates.io/zerocopy/0.7.32 \
    crate://crates.io/zeroize/1.7.0 \
"

SRC_URI[sha256sum] = "f87ea42d5cdebdc6a69761a9d0bc83ae9b3b30d0ad78952005ba6568d6c022af"

SRC_URI[Inflector-0.11.4.sha256sum] = "fe438c63458706e03479442743baae6c88256498e6431708f6dfc520a26515d3"
SRC_URI[adler-1.0.2.sha256sum] = "f26201604c87b1e01bd3d98f8d5d9a8fcbb815e8cedb41ffccbeb4bf593a35fe"
SRC_URI[ahash-0.8.10.sha256sum] = "8b79b82693f705137f8fb9b37871d99e4f9a7df12b917eed79c3d3954830a60b"
SRC_URI[ahash-0.8.11.sha256sum] = "e89da841a80418a9b391ebaea17f5c112ffaaa96f621d2c285b5174da76b9011"
SRC_URI[aho-corasick-1.1.3.sha256sum] = "8e60d3430d3a69478ad0993f19238d2df97c507009a52b3c10addcd7f6bcb916"
SRC_URI[allocator-api2-0.2.16.sha256sum] = "0942ffc6dcaadf03badf6e6a2d0228460359d5e34b57ccdc720b7382dfbd5ec5"
SRC_URI[android-tzdata-0.1.1.sha256sum] = "e999941b234f3131b00bc13c22d06e8c5ff726d1b6318ac7eb276997bbb4fef0"
SRC_URI[android_system_properties-0.1.5.sha256sum] = "819e7219dbd41043ac279b19830f2efc897156490d7fd6ea916720117ee66311"
SRC_URI[anes-0.1.6.sha256sum] = "4b46cbb362ab8752921c97e041f5e366ee6297bd428a31275b9fcf1e380f7299"
SRC_URI[annotate-snippets-0.6.1.sha256sum] = "c7021ce4924a3f25f802b2cccd1af585e39ea1a363a1aa2e72afe54b67a3a7a7"
SRC_URI[annotate-snippets-0.9.2.sha256sum] = "ccaf7e9dfbb6ab22c82e473cd1a8a7bd313c19a5b7e40970f3d89ef5a5c9e81e"
SRC_URI[anstream-0.6.13.sha256sum] = "d96bd03f33fe50a863e394ee9718a706f988b9079b20c3784fb726e7678b62fb"
SRC_URI[anstyle-1.0.6.sha256sum] = "8901269c6307e8d93993578286ac0edf7f195079ffff5ebdeea6a59ffb7e36bc"
SRC_URI[anstyle-parse-0.2.3.sha256sum] = "c75ac65da39e5fe5ab759307499ddad880d724eed2f6ce5b5e8a26f4f387928c"
SRC_URI[anstyle-query-1.0.2.sha256sum] = "e28923312444cdd728e4738b3f9c9cac739500909bb3d3c94b43551b16517648"
SRC_URI[anstyle-wincon-3.0.2.sha256sum] = "1cd54b81ec8d6180e24654d0b371ad22fc3dd083b6ff8ba325b72e00c87660a7"
SRC_URI[anyhow-1.0.82.sha256sum] = "f538837af36e6f6a9be0faa67f9a314f8119e4e4b5867c6ab40ed60360142519"
SRC_URI[argfile-0.2.0.sha256sum] = "b7c5c8e418080ef8aa932039d12eda7b6f5043baf48f1523c166fbc32d004534"
SRC_URI[arrayvec-0.7.4.sha256sum] = "96d30a06541fbafbc7f82ed10c06164cfbd2c401138f6addd8404629c4b16711"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[autocfg-1.2.0.sha256sum] = "f1fdabc7756949593fe60f30ec81974b613357de856987752631dea1e3394c80"
SRC_URI[base64-0.21.7.sha256sum] = "9d297deb1925b89f2ccc13d7635fa0714f12c87adce1c75356b39ca9b7178567"
SRC_URI[base64-0.22.0.sha256sum] = "9475866fec1451be56a3c2400fd081ff546538961565ccb5b7142cbd22bc7a51"
SRC_URI[bincode-1.3.3.sha256sum] = "b1f45e9417d87227c7a56d22e471c6206462cba514c7590c09aff4cf6d1ddcad"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bitflags-2.5.0.sha256sum] = "cf4b9d6a944f767f8e5e0db018570623c85f3d925ac718db4e06d0187adb21c1"
SRC_URI[bstr-1.9.1.sha256sum] = "05efc5cfd9110c8416e471df0e96702d58690178e206e61b7173706673c93706"
SRC_URI[bumpalo-3.15.3.sha256sum] = "8ea184aa71bb362a1157c896979544cc23974e08fd265f29ea96b59f0b4a555b"
SRC_URI[bumpalo-3.16.0.sha256sum] = "79296716171880943b8470b5f8d03aa55eb2e645a4874bdbb28adb49162e012c"
SRC_URI[cachedir-0.3.1.sha256sum] = "4703f3937077db8fa35bee3c8789343c1aec2585f0146f09d658d4ccc0e8d873"
SRC_URI[cast-0.3.0.sha256sum] = "37b2a672a2cb129a2e41c10b1224bb368f9f37a2b16b612598138befd7b37eb5"
SRC_URI[cc-1.0.88.sha256sum] = "02f341c093d19155a6e41631ce5971aac4e9a868262212153124c15fa22d1cdc"
SRC_URI[cc-1.0.95.sha256sum] = "d32a725bc159af97c3e629873bb9f88fb8cf8a4867175f76dc987815ea07c83b"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[cfg_aliases-0.1.1.sha256sum] = "fd16c4719339c4530435d38e511904438d07cce7950afa3718a84ac36c10e89e"
SRC_URI[chic-1.2.2.sha256sum] = "a5b5db619f3556839cb2223ae86ff3f9a09da2c5013be42bc9af08c9589bf70c"
SRC_URI[chrono-0.4.38.sha256sum] = "a21f936df1771bf62b77f047b726c4625ff2e8aa607c01ec06e5a05bd8463401"
SRC_URI[ciborium-0.2.2.sha256sum] = "42e69ffd6f0917f5c029256a24d0161db17cea3997d185db0d35926308770f0e"
SRC_URI[ciborium-io-0.2.2.sha256sum] = "05afea1e0a06c9be33d539b876f1ce3692f4afea2cb41f740e7743225ed1c757"
SRC_URI[ciborium-ll-0.2.2.sha256sum] = "57663b653d948a338bfb3eeba9bb2fd5fcfaecb9e199e87e1eda4d9e8b240fd9"
SRC_URI[clap-4.5.4.sha256sum] = "90bc066a67923782aa8515dbaea16946c5bcc5addbd668bb80af688e53e548a0"
SRC_URI[clap_builder-4.5.2.sha256sum] = "ae129e2e766ae0ec03484e609954119f123cc1fe650337e155d03b022f24f7b4"
SRC_URI[clap_complete-4.5.1.sha256sum] = "885e4d7d5af40bfb99ae6f9433e292feac98d452dcb3ec3d25dfe7552b77da8c"
SRC_URI[clap_complete-4.5.2.sha256sum] = "dd79504325bf38b10165b02e89b4347300f855f273c4cb30c4a3209e6583275e"
SRC_URI[clap_complete_command-0.5.1.sha256sum] = "183495371ea78d4c9ff638bfc6497d46fed2396e4f9c50aebc1278a4a9919a3d"
SRC_URI[clap_complete_fig-4.5.0.sha256sum] = "54b3e65f91fabdd23cac3d57d39d5d938b4daabd070c335c006dccb866a61110"
SRC_URI[clap_complete_nushell-0.1.11.sha256sum] = "5d02bc8b1a18ee47c4d2eec3fb5ac034dc68ebea6125b1509e9ccdffcddce66e"
SRC_URI[clap_derive-4.5.4.sha256sum] = "528131438037fd55894f62d6e9f068b8f45ac57ffa77517819645d10aed04f64"
SRC_URI[clap_lex-0.7.0.sha256sum] = "98cc8fbded0c607b7ba9dd60cd98df59af97e84d24e49c8557331cfc26d301ce"
SRC_URI[clearscreen-3.0.0.sha256sum] = "2f8c93eb5f77c9050c7750e14f13ef1033a40a0aac70c6371535b6763a01438c"
SRC_URI[codspeed-2.4.1.sha256sum] = "655a6d8e698ef8de25b6fb160dc904d98cf3642df48fae8bb05711db1893f47d"
SRC_URI[codspeed-2.6.0.sha256sum] = "3a104ac948e0188b921eb3fcbdd55dcf62e542df4c7ab7e660623f6288302089"
SRC_URI[codspeed-criterion-compat-2.4.1.sha256sum] = "cb377d73b85084b1ca5615e42fdbf3b52631d6d8feda4be6dfc2150646f53cea"
SRC_URI[codspeed-criterion-compat-2.6.0.sha256sum] = "722c36bdc62d9436d027256ce2627af81ac7a596dfc7d13d849d0d212448d7fe"
SRC_URI[colorchoice-1.0.0.sha256sum] = "acbf1af155f9b9ef647e42cdc158db4b64a1b61f743629225fde6f3e0be2a7c7"
SRC_URI[colored-2.1.0.sha256sum] = "cbf2150cce219b664a8a70df7a1f933836724b503f8a413af9365b4dcc4d90b8"
SRC_URI[console-0.15.8.sha256sum] = "0e1f83fc076bd6dd27517eacdf25fef6c4dfe5f1d7448bafaaf3a26f13b5e4eb"
SRC_URI[console_error_panic_hook-0.1.7.sha256sum] = "a06aeb73f470f66dcdbf7223caeebb85984942f22f1adb2a088cf9668146bbbc"
SRC_URI[console_log-1.0.0.sha256sum] = "be8aed40e4edbf4d3b4431ab260b63fdc40f5780a4766824329ea0f1eefe3c0f"
SRC_URI[core-foundation-sys-0.8.6.sha256sum] = "06ea2b9bc92be3c2baa9334a323ebca2d6f074ff852cd1d7b11064035cd3868f"
SRC_URI[countme-3.0.1.sha256sum] = "7704b5fdd17b18ae31c4c1da5a2e0305a2bf17b5249300a9ee9ed7b72114c636"
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
SRC_URI[ctrlc-3.4.4.sha256sum] = "672465ae37dc1bc6380a6547a8883d5dd397b0f1faaad4f265726cc7042a5345"
SRC_URI[darling-0.20.8.sha256sum] = "54e36fcd13ed84ffdfda6f5be89b31287cbb80c439841fe69e04841435464391"
SRC_URI[darling_core-0.20.8.sha256sum] = "9c2cf1c23a687a1feeb728783b993c4e1ad83d99f351801977dd809b48d0a70f"
SRC_URI[darling_macro-0.20.8.sha256sum] = "a668eda54683121533a393014d8692171709ff57a7d61f187b6e782719f8933f"
SRC_URI[dashmap-5.5.3.sha256sum] = "978747c1d849a7d2ee5e8adc0159961c48fb7e5db2f06af6723b80123bb53856"
SRC_URI[diff-0.1.13.sha256sum] = "56254986775e3233ffa9c4d7d3faaf6d36a2c09d30b20687e9f88bc8bafc16c8"
SRC_URI[dirs-4.0.0.sha256sum] = "ca3aa72a6f96ea37bbc5aa912f6788242832f75369bdfdadcb0e38423f100059"
SRC_URI[dirs-5.0.1.sha256sum] = "44c45a9d03d6676652bcb5e724c7e988de1acad23a711b5217ab9cbecbec2225"
SRC_URI[dirs-sys-0.3.7.sha256sum] = "1b1d1d91c932ef41c0f2663aa8b0ca0342d444d842c06914aa0a7e352d0bada6"
SRC_URI[dirs-sys-0.4.1.sha256sum] = "520f05a5cbd335fae5a99ff7a6ab8627577660ee5cfd6a94a6a929b52ff0321c"
SRC_URI[drop_bomb-0.1.5.sha256sum] = "9bda8e21c04aca2ae33ffc2fd8c23134f3cac46db123ba97bd9d3f3b8a4a85e1"
SRC_URI[dyn-clone-1.0.17.sha256sum] = "0d6ef0072f8a535281e4876be788938b528e9a1d43900b82c2569af7da799125"
SRC_URI[either-1.10.0.sha256sum] = "11157ac094ffbdde99aa67b23417ebdd801842852b500e395a45a9c0aac03e4a"
SRC_URI[either-1.11.0.sha256sum] = "a47c1c47d2f5964e29c61246e81db715514cd532db6b5116a25ea3c03d6780a2"
SRC_URI[encode_unicode-0.3.6.sha256sum] = "a357d28ed41a50f9c765dbfe56cbc04a64e53e5fc58ba79fbc34c10ef3df831f"
SRC_URI[env_filter-0.1.0.sha256sum] = "a009aa4810eb158359dda09d0c87378e4bbb89b5a801f016885a4707ba24f7ea"
SRC_URI[env_logger-0.11.3.sha256sum] = "38b35839ba51819680ba087cd351788c9a3c476841207e0b8cee0b04722343b9"
SRC_URI[equivalent-1.0.1.sha256sum] = "5443807d6dff69373d433ab9ef5378ad8df50ca6298caf15de6e52e24aaf54d5"
SRC_URI[errno-0.3.8.sha256sum] = "a258e46cdc063eb8519c00b9fc845fc47bcfca4130e2f08e88665ceda8474245"
SRC_URI[fastrand-2.0.1.sha256sum] = "25cbce373ec4653f1a01a31e8a5e5ec0c622dc27ff9c4e6606eefef5cbbed4a5"
SRC_URI[fastrand-2.0.2.sha256sum] = "658bd65b1cf4c852a3cc96f18a8ce7b5640f6b703f905c7d74532294c2a63984"
SRC_URI[fern-0.6.2.sha256sum] = "d9f0c14694cbd524c8720dd69b0e3179344f04ebb5f90f2e4a440c6ea3b2f1ee"
SRC_URI[filetime-0.2.23.sha256sum] = "1ee447700ac8aa0b2f2bd7bc4462ad686ba06baa6727ac149a2d6277f0d240fd"
SRC_URI[flate2-1.0.28.sha256sum] = "46303f565772937ffe1d394a4fac6f411c6013172fadde9dcdb1e147a086940e"
SRC_URI[fnv-1.0.7.sha256sum] = "3f9eec918d3f24069decb9af1554cad7c880e2da24a9afd88aca000531ab82c1"
SRC_URI[form_urlencoded-1.2.1.sha256sum] = "e13624c2627564efccf4934284bdd98cbaa14e79b0b5a141218e507b3a823456"
SRC_URI[fs-err-2.11.0.sha256sum] = "88a41f105fe1d5b6b34b2055e3dc59bb79b46b48b2040b9e6c7b4b5de097aa41"
SRC_URI[fsevent-sys-4.1.0.sha256sum] = "76ee7a02da4d231650c7cea31349b889be2f45ddb3ef3032d2ec8185f6313fd2"
SRC_URI[getopts-0.2.21.sha256sum] = "14dbbfd5c71d70241ecf9e6f13737f7b5ce823821063188d7e46c41d371eebd5"
SRC_URI[getrandom-0.2.12.sha256sum] = "190092ea657667030ac6a35e305e62fc4dd69fd98ac98631e5d3a2b1575a12b5"
SRC_URI[getrandom-0.2.14.sha256sum] = "94b22e06ecb0110981051723910cbf0b5f5e09a2062dd7663334ee79a9d1286c"
SRC_URI[glob-0.3.1.sha256sum] = "d2fabcfbdc87f4758337ca535fb41a6d701b65693ce38287d856d1674551ec9b"
SRC_URI[globset-0.4.14.sha256sum] = "57da3b9b5b85bd66f31093f8c408b90a74431672542466497dcbdfdc02034be1"
SRC_URI[half-2.4.0.sha256sum] = "b5eceaaeec696539ddaf7b333340f1af35a5aa87ae3e4f3ead0532f72affab2e"
SRC_URI[half-2.4.1.sha256sum] = "6dd08c532ae367adf81c312a4580bc67f1d0fe8bc9c460520283f4c0ff277888"
SRC_URI[hashbrown-0.12.3.sha256sum] = "8a9ee70c43aaf417c914396645a0fa852624801b24ebb7ae78fe8272889ac888"
SRC_URI[hashbrown-0.14.3.sha256sum] = "290f1a1d9242c78d09ce40a5e87e7554ee637af1351968159f4952f028f75604"
SRC_URI[hashbrown-0.14.5.sha256sum] = "e5274423e17b7c9fc20b6e7e208532f9b19825d82dfd615708b70edd83df41f1"
SRC_URI[heck-0.4.1.sha256sum] = "95505c38b4572b2d910cecb0281560f54b440a19336cbbcb27bf6ce6adc6f5a8"
SRC_URI[heck-0.5.0.sha256sum] = "2304e00983f87ffb38b55b444b5e3b60a884b5d30c0fca7d82fe33449bbe55ea"
SRC_URI[hermit-abi-0.3.9.sha256sum] = "d231dfb89cfffdbc30e7fc41579ed6066ad03abda9e567ccafae602b97ec5024"
SRC_URI[hexf-parse-0.2.1.sha256sum] = "dfa686283ad6dd069f105e5ab091b04c62850d3e4cf5d67debad1933f55023df"
SRC_URI[home-0.5.9.sha256sum] = "e3d1354bf6b7235cb4a0576c2619fd4ed18183f689b12b006a0ee7329eeff9a5"
SRC_URI[humantime-2.1.0.sha256sum] = "9a3a5bfb195931eeb336b2a7b4d761daec841b97f947d34394601737a7bba5e4"
SRC_URI[iana-time-zone-0.1.60.sha256sum] = "e7ffbb5a1b541ea2561f8c41c087286cc091e21e556a4f09a8f6cbf17b69b141"
SRC_URI[iana-time-zone-haiku-0.1.2.sha256sum] = "f31827a206f56af32e590ba56d5d2d085f558508192593743f16b2306495269f"
SRC_URI[ident_case-1.0.1.sha256sum] = "b9e0384b61958566e926dc50660321d12159025e767c18e043daf26b70104c39"
SRC_URI[idna-0.5.0.sha256sum] = "634d9b1461af396cad843f47fdba5597a4f9e6ddd4bfb6ff5d85028c25cb12f6"
SRC_URI[ignore-0.4.22.sha256sum] = "b46810df39e66e925525d6e38ce1e7f6e1d208f72dc39757880fcb66e2c58af1"
SRC_URI[imara-diff-0.1.5.sha256sum] = "e98c1d0ad70fc91b8b9654b1f33db55e59579d3b3de2bffdced0fdb810570cb8"
SRC_URI[imperative-1.0.5.sha256sum] = "8b70798296d538cdaa6d652941fcc795963f8b9878b9e300c9fab7a522bd2fc0"
SRC_URI[indexmap-2.2.5.sha256sum] = "7b0b929d511467233429c45a44ac1dcaa21ba0f5ba11e4879e6ed28ddb4f9df4"
SRC_URI[indexmap-2.2.6.sha256sum] = "168fb715dda47215e360912c096649d23d58bf392ac62f73919e831745e40f26"
SRC_URI[indicatif-0.17.8.sha256sum] = "763a5a8f45087d6bcea4222e7b72c291a054edf80e4ef6efd2a4979878c7bea3"
SRC_URI[indoc-2.0.5.sha256sum] = "b248f5224d1d606005e02c97f5aa4e88eeb230488bcc03bc9ca4d7991399f2b5"
SRC_URI[inotify-0.9.6.sha256sum] = "f8069d3ec154eb856955c1c0fbffefbf5f3c40a104ec912d4797314c1801abff"
SRC_URI[inotify-sys-0.1.5.sha256sum] = "e05c02b5e89bff3b946cedeca278abc628fe811e604f027c45a8aa3cf793d0eb"
SRC_URI[insta-1.38.0.sha256sum] = "3eab73f58e59ca6526037208f0e98851159ec1633cf17b6cd2e1f2c3fd5d53cc"
SRC_URI[insta-cmd-0.6.0.sha256sum] = "ffeeefa927925cced49ccb01bf3e57c9d4cd132df21e576eb9415baeab2d3de6"
SRC_URI[instant-0.1.12.sha256sum] = "7a5bbe824c507c5da5956355e86a746d82e0e1464f65d862cc5e71da70e94b2c"
SRC_URI[is-docker-0.2.0.sha256sum] = "928bae27f42bc99b60d9ac7334e3a21d10ad8f1835a4e12ec3ec0464765ed1b3"
SRC_URI[is-macro-0.3.5.sha256sum] = "59a85abdc13717906baccb5a1e435556ce0df215f242892f721dff62bf25288f"
SRC_URI[is-terminal-0.4.12.sha256sum] = "f23ff5ef2b80d608d61efee834934d862cd92461afc0560dedf493e4c033738b"
SRC_URI[is-wsl-0.4.0.sha256sum] = "173609498df190136aa7dea1a91db051746d339e18476eed5ca40521f02d7aa5"
SRC_URI[itertools-0.10.5.sha256sum] = "b0fd2260e829bddf4cb6ea802289de2f86d6a7a690192fbe91b3f46e0f2c8473"
SRC_URI[itertools-0.12.1.sha256sum] = "ba291022dbbd398a455acf126c1e341954079855bc60dfdda641363bd6922569"
SRC_URI[itoa-1.0.10.sha256sum] = "b1a46d1a171d865aa5f83f92695765caa047a9b4cbae2cbf37dbd613a793fd4c"
SRC_URI[itoa-1.0.11.sha256sum] = "49f1f14873335454500d59611f1cf4a4b0f786f9ac11f4312a78e4cf2566695b"
SRC_URI[jod-thread-0.1.2.sha256sum] = "8b23360e99b8717f20aaa4598f5a6541efbe30630039fbc7706cf954a87947ae"
SRC_URI[js-sys-0.3.69.sha256sum] = "29c15563dc2726973df627357ce0c9ddddbea194836909d655df6a75d2cf296d"
SRC_URI[kqueue-1.0.8.sha256sum] = "7447f1ca1b7b563588a205fe93dea8df60fd981423a768bc1c0ded35ed147d0c"
SRC_URI[kqueue-sys-1.0.4.sha256sum] = "ed9625ffda8729b85e45cf04090035ac368927b8cebc34898e7c120f52e4838b"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[lexical-parse-float-0.8.5.sha256sum] = "683b3a5ebd0130b8fb52ba0bdc718cc56815b6a097e28ae5a6997d0ad17dc05f"
SRC_URI[lexical-parse-integer-0.8.6.sha256sum] = "6d0994485ed0c312f6d965766754ea177d07f9c00c9b82a5ee62ed5b47945ee9"
SRC_URI[lexical-util-0.8.5.sha256sum] = "5255b9ff16ff898710eb9eb63cb39248ea8a5bb036bea8085b1a767ff6c4e3fc"
SRC_URI[libc-0.2.154.sha256sum] = "ae743338b92ff9146ce83992f766a31066a91a8c84a45e0e9f21e7cf6de6d346"
SRC_URI[libcst-1.3.1.sha256sum] = "6f1e25d1b119ab5c2f15a6e081bb94a8d547c5c2ad065f5fd0dbb683f31ced91"
SRC_URI[libcst_derive-1.3.1.sha256sum] = "4a5011f2d59093de14a4a90e01b9d85dee9276e58a25f0107dcee167dd601be0"
SRC_URI[libmimalloc-sys-0.1.35.sha256sum] = "3979b5c37ece694f1f5e51e7ecc871fdb0f517ed04ee45f88d15d6d553cb9664"
SRC_URI[libmimalloc-sys-0.1.37.sha256sum] = "81eb4061c0582dedea1cbc7aff2240300dd6982e0239d1c99e65c1dbf4a30ba7"
SRC_URI[libredox-0.0.1.sha256sum] = "85c833ca1e66078851dba29046874e38f08b2c883700aa29a03ddd3b23814ee8"
SRC_URI[libredox-0.1.3.sha256sum] = "c0ff37bd590ca25063e35af745c343cb7a0271906fb7b37e4813e8f79f00268d"
SRC_URI[linked-hash-map-0.5.6.sha256sum] = "0717cef1bc8b636c6e1c1bbdefc09e6322da8a9321966e8928ef80d20f7f770f"
SRC_URI[linux-raw-sys-0.4.13.sha256sum] = "01cda141df6706de531b6c46c3a33ecca755538219bd484262fa09410c13539c"
SRC_URI[lock_api-0.4.11.sha256sum] = "3c168f8615b12bc01f9c17e2eb0cc07dcae1940121185446edc3744920e8ef45"
SRC_URI[log-0.4.21.sha256sum] = "90ed8c1e510134f979dbc4f070f87d4313098b704861a105fe34231c70a3901c"
SRC_URI[lsp-server-0.7.6.sha256sum] = "248f65b78f6db5d8e1b1604b4098a28b43d21a8eb1deeca22b1c421b276c7095"
SRC_URI[lsp-types-0.95.1.sha256sum] = "8e34d33a8e9b006cd3fc4fe69a921affa097bae4bb65f76271f4644f9a334365"
SRC_URI[matchers-0.1.0.sha256sum] = "8263075bb86c5a1b1427b5ae862e8889656f126e9f77c484496e8b47cf5c5558"
SRC_URI[matches-0.1.10.sha256sum] = "2532096657941c2fea9c289d370a250971c689d4f143798ff67113ec042024a5"
SRC_URI[matchit-0.8.2.sha256sum] = "540f1c43aed89909c0cc0cc604e3bb2f7e7a341a3728a9e6cfe760e733cd11ed"
SRC_URI[memchr-2.7.2.sha256sum] = "6c8640c5d730cb13ebd907d8d04b52f55ac9a2eec55b440c8892f40d56c76c1d"
SRC_URI[mimalloc-0.1.39.sha256sum] = "fa01922b5ea280a911e323e4d2fd24b7fe5cc4042e0d2cda3c40775cdc4bdc9c"
SRC_URI[mimalloc-0.1.41.sha256sum] = "9f41a2280ded0da56c8cf898babb86e8f10651a34adcfff190ae9a1159c6908d"
SRC_URI[minimal-lexical-0.2.1.sha256sum] = "68354c5c6bd36d73ff3feceb05efa59b6acb7626617f4962be322a825e61f79a"
SRC_URI[miniz_oxide-0.7.2.sha256sum] = "9d811f3e15f28568be3407c8e7fdb6514c1cda3cb30683f15b6a1a1dc4ea14a7"
SRC_URI[mio-0.8.11.sha256sum] = "a4a650543ca06a924e8b371db273b2756685faae30f8487da1b56505a8f78b0c"
SRC_URI[natord-1.0.9.sha256sum] = "308d96db8debc727c3fd9744aac51751243420e46edf401010908da7f8d5e57c"
SRC_URI[newtype-uuid-1.1.0.sha256sum] = "3526cb7c660872e401beaf3297f95f548ce3b4b4bdd8121b7c0713771d7c4a6e"
SRC_URI[nix-0.28.0.sha256sum] = "ab2156c4fce2f8df6c499cc1c763e4394b7482525bf2a9701c9d79d215f519e4"
SRC_URI[nom-7.1.3.sha256sum] = "d273983c5a657a70a3e8f2a01329822f3b8c8172b73826411a55751e404a0a4a"
SRC_URI[notify-6.1.1.sha256sum] = "6205bd8bb1e454ad2e27422015fb5e4f2bcc7e08fa8f27058670d208324a4d2d"
SRC_URI[nu-ansi-term-0.46.0.sha256sum] = "77a8165726e8236064dbb45459242600304b42a5ea24ee2948e18e023bf7ba84"
SRC_URI[nu-ansi-term-0.49.0.sha256sum] = "c073d3c1930d0751774acf49e66653acecb416c3a54c6ec095a9b11caddb5a68"
SRC_URI[num-traits-0.2.18.sha256sum] = "da0df0e5185db44f69b44f26786fe401b6c293d1907744beaa7fa62b2e5a517a"
SRC_URI[num_cpus-1.16.0.sha256sum] = "4161fcb6d602d4d2081af7c3a45852d875a03dd337a6bfdd6e06407b61342a43"
SRC_URI[number_prefix-0.4.0.sha256sum] = "830b246a0e5f20af87141b25c173cd1b609bd7779a4617d6ec582abaf90870f3"
SRC_URI[once_cell-1.19.0.sha256sum] = "3fdb12b2476b595f9358c5161aa467c2438859caa136dec86c26fdd2efe17b92"
SRC_URI[oorandom-11.1.3.sha256sum] = "0ab1bc2a289d34bd04a330323ac98a1b4bc82c9d9fcb1e66b63caa84da26b575"
SRC_URI[option-ext-0.2.0.sha256sum] = "04744f49eae99ab78e0d5c0b603ab218f515ea8cfe5a456d7629ad883a3b6e7d"
SRC_URI[os_str_bytes-6.6.1.sha256sum] = "e2355d85b9a3786f481747ced0e0ff2ba35213a1f9bd406ed906554d7af805a1"
SRC_URI[overload-0.1.1.sha256sum] = "b15813163c1d831bf4a13c3610c05c0d03b39feb07f7e09fa234dac9b15aaf39"
SRC_URI[parking_lot-0.12.2.sha256sum] = "7e4af0ca4f6caed20e900d564c242b8e5d4903fdacf31d3daf527b66fe6f42fb"
SRC_URI[parking_lot_core-0.9.9.sha256sum] = "4c42a9226546d68acdd9c0a280d17ce19bfe27a46bf68784e4066115788d008e"
SRC_URI[paste-1.0.14.sha256sum] = "de3145af08024dea9fa9914f381a17b8fc6034dfb00f3a84013f7ff43f29ed4c"
SRC_URI[path-absolutize-3.1.1.sha256sum] = "e4af381fe79fa195b4909485d99f73a80792331df0625188e707854f0b3383f5"
SRC_URI[path-dedot-3.1.1.sha256sum] = "07ba0ad7e047712414213ff67533e6dd477af0a4e1d14fb52343e53d30ea9397"
SRC_URI[path-slash-0.2.1.sha256sum] = "1e91099d4268b0e11973f036e885d652fb0b21fedcf69738c627f94db6a44f42"
SRC_URI[pathdiff-0.2.1.sha256sum] = "8835116a5c179084a830efb3adc117ab007512b535bc1a21c991d3b32a6b44dd"
SRC_URI[peg-0.8.2.sha256sum] = "400bcab7d219c38abf8bd7cc2054eb9bbbd4312d66f6a5557d572a203f646f61"
SRC_URI[peg-macros-0.8.2.sha256sum] = "46e61cce859b76d19090f62da50a9fe92bab7c2a5f09e183763559a2ac392c90"
SRC_URI[peg-runtime-0.8.2.sha256sum] = "36bae92c60fa2398ce4678b98b2c4b5a7c61099961ca1fa305aec04a9ad28922"
SRC_URI[pep440_rs-0.4.0.sha256sum] = "e0c29f9c43de378b4e4e0cd7dbcce0e5cfb80443de8c05620368b2948bc936a1"
SRC_URI[pep440_rs-0.6.0.sha256sum] = "ca0a570e7ec9171250cac57614e901f62408094b54b3798bb920d3cf0d4a0e09"
SRC_URI[pep508_rs-0.3.0.sha256sum] = "910c513bea0f4f833122321c0f20e8c704e01de98692f6989c2ec21f43d88b1e"
SRC_URI[percent-encoding-2.3.1.sha256sum] = "e3148f5046208a5d56bcfc03053e3ca6334e51da8dfb19b6cdc8b306fae3283e"
SRC_URI[phf-0.11.2.sha256sum] = "ade2d8b8f33c7333b51bcf0428d37e217e9f32192ae4772156f65063b8ce03dc"
SRC_URI[phf_codegen-0.11.2.sha256sum] = "e8d39688d359e6b34654d328e262234662d16cc0f60ec8dcbe5e718709342a5a"
SRC_URI[phf_generator-0.11.2.sha256sum] = "48e4cc64c2ad9ebe670cb8fd69dd50ae301650392e81c05f9bfcb2d5bdbc24b0"
SRC_URI[phf_shared-0.11.2.sha256sum] = "90fcb95eef784c2ac79119d1dd819e162b5da872ce6f3c3abe1e8ca1c082f72b"
SRC_URI[pin-project-lite-0.2.13.sha256sum] = "8afb450f006bf6385ca15ef45d71d2288452bc3683ce2e2cacc0d18e4be60b58"
SRC_URI[pin-project-lite-0.2.14.sha256sum] = "bda66fc9667c18cb2758a2ac84d1167245054bcf85d5d1aaa6923f45801bdd02"
SRC_URI[pmutil-0.6.1.sha256sum] = "52a40bc70c2c58040d2d8b167ba9a5ff59fc9dab7ad44771cfde3dcfde7a09c6"
SRC_URI[portable-atomic-1.6.0.sha256sum] = "7170ef9988bc169ba16dd36a7fa041e5c4cbeb6a35b76d4c03daded371eae7c0"
SRC_URI[ppv-lite86-0.2.17.sha256sum] = "5b40af805b3121feab8a3c29f04d8ad262fa8e0561883e7653e024ae4479e6de"
SRC_URI[pretty_assertions-1.4.0.sha256sum] = "af7cee1a6c8a5b9208b3cb1061f10c0cb689087b3d8ce85fb9d2dd7a29b6ba66"
SRC_URI[proc-macro2-1.0.80.sha256sum] = "a56dea16b0a29e94408b9aa5e2940a4eedbd128a1ba20e8f7ae60fd3d465af0e"
SRC_URI[proc-macro2-1.0.81.sha256sum] = "3d1597b0c024618f09a9c3b8655b7e430397a36d23fdafec26d6965e9eec3eba"
SRC_URI[pyproject-toml-0.9.0.sha256sum] = "95c3dd745f99aa3c554b7bb00859f7d18c2f1d6afd749ccc86d60b61e702abd9"
SRC_URI[quick-junit-0.3.6.sha256sum] = "d1a341ae463320e9f8f34adda49c8a85d81d4e8f34cce4397fb0350481552224"
SRC_URI[quick-junit-0.4.0.sha256sum] = "cfc1a6a5406a114913df2df8507998c755311b55b78584bed5f6e88f6417c4d4"
SRC_URI[quick-xml-0.31.0.sha256sum] = "1004a344b30a54e2ee58d66a71b32d2db2feb0a31f9a2d302bf0536f15de2a33"
SRC_URI[quote-1.0.36.sha256sum] = "0fa76aaf39101c457836aec0ce2316dbdc3ab723cdda1c6bd4e6ad4208acaca7"
SRC_URI[rand-0.8.5.sha256sum] = "34af8d1a0e25924bc5b7c43c079c942339d8f0a8b57c39049bef581b46327404"
SRC_URI[rand_chacha-0.3.1.sha256sum] = "e6c10a63a0fa32252be49d21e7709d4d4baf8d231c2dbce1eaa8141b9b127d88"
SRC_URI[rand_core-0.6.4.sha256sum] = "ec0be4795e2f6a28069bec0b5ff3e2ac9bafc99e6a9a7dc3547996c5c816922c"
SRC_URI[rayon-1.10.0.sha256sum] = "b418a60154510ca1a002a752ca9714984e21e4241e804d32555251faf8b78ffa"
SRC_URI[rayon-core-1.12.1.sha256sum] = "1465873a3dfdaa8ae7cb14b4383657caab0b3e8a0aa9ae8e04b044854c8dfce2"
SRC_URI[redox_syscall-0.4.1.sha256sum] = "4722d768eff46b75989dd134e5c353f0d6296e5aaa3132e776cbdb56be7731aa"
SRC_URI[redox_users-0.4.4.sha256sum] = "a18479200779601e498ada4e8c1e1f50e3ee19deb0259c25825a98b5603b2cb4"
SRC_URI[redox_users-0.4.5.sha256sum] = "bd283d9651eeda4b2a83a43c1c91b266c40fd76ecd39a50a8c630ae69dc72891"
SRC_URI[regex-1.10.4.sha256sum] = "c117dbdfde9c8308975b6a18d71f3f385c89461f7b3fb054288ecf2a2058ba4c"
SRC_URI[regex-automata-0.1.10.sha256sum] = "6c230d73fb8d8c1b9c0b3135c5142a8acee3a0558fb8db5cf1cb65f8d7862132"
SRC_URI[regex-automata-0.4.5.sha256sum] = "5bb987efffd3c6d0d8f5f89510bb458559eab11e4f869acb20bf845e016259cd"
SRC_URI[regex-automata-0.4.6.sha256sum] = "86b83b8b9847f9bf95ef68afb0b8e6cdb80f498442f5179a29fad448fcc1eaea"
SRC_URI[regex-syntax-0.6.29.sha256sum] = "f162c6dd7b008981e4d40210aca20b4bd0f9b60ca9271061b07f78537722f2e1"
SRC_URI[regex-syntax-0.8.2.sha256sum] = "c08c74e62047bb2de4ff487b251e4a92e24f48745648451635cec7d591162d9f"
SRC_URI[regex-syntax-0.8.3.sha256sum] = "adad44e29e4c806119491a7f06f03de4d1af22c3a680dd47f1e6e179439d1f56"
SRC_URI[result-like-0.5.0.sha256sum] = "abf7172fef6a7d056b5c26bf6c826570267562d51697f4982ff3ba4aec68a9df"
SRC_URI[result-like-derive-0.5.0.sha256sum] = "a8d6574c02e894d66370cfc681e5d68fedbc9a548fb55b30a96b3f0ae22d0fe5"
SRC_URI[ring-0.17.8.sha256sum] = "c17fa4cb658e3583423e915b9f3acc01cceaee1860e33d59ebae66adc3a2dc0d"
SRC_URI[rust-stemmers-1.2.0.sha256sum] = "e46a2036019fdb888131db7a4c847a1063a7493f971ed94ea82c67eada63ca54"
SRC_URI[rustc-hash-1.1.0.sha256sum] = "08d43f7aa6b08d49f382cde6a7982047c3426db949b1424bc4b7ec9ae12c6ce2"
SRC_URI[rustix-0.38.31.sha256sum] = "6ea3e1a662af26cd7a3ba09c0297a31af215563ecf42817c98df621387f4e949"
SRC_URI[rustix-0.38.34.sha256sum] = "70dc5ec042f7a43c4a73241207cecc9873a06d45debb38b329f8541d85c2730f"
SRC_URI[rustls-0.22.2.sha256sum] = "e87c9956bd9807afa1f77e0f7594af32566e830e088a5576d27c5b6f30f49d41"
SRC_URI[rustls-0.22.4.sha256sum] = "bf4ef73721ac7bcd79b2b315da7779d8fc09718c6b3d2d1b2d94850eb8c18432"
SRC_URI[rustls-pki-types-1.3.1.sha256sum] = "5ede67b28608b4c60685c7d54122d4400d90f62b40caee7700e700380a390fa8"
SRC_URI[rustls-pki-types-1.5.0.sha256sum] = "beb461507cee2c2ff151784c52762cf4d9ff6a61f3e80968600ed24fa837fa54"
SRC_URI[rustls-webpki-0.102.2.sha256sum] = "faaa0a62740bedb9b2ef5afa303da42764c012f743917351dc9a237ea1663610"
SRC_URI[rustls-webpki-0.102.3.sha256sum] = "f3bce581c0dd41bce533ce695a1437fa16a7ab5ac3ccfa99fe1a620a7885eabf"
SRC_URI[rustversion-1.0.14.sha256sum] = "7ffc183a10b4478d04cbbbfc96d0873219d962dd5accaff2ffbd4ceb7df837f4"
SRC_URI[rustversion-1.0.15.sha256sum] = "80af6f9131f277a45a3fba6ce8e2258037bb0477a67e610d3c1fe046ab31de47"
SRC_URI[ryu-1.0.17.sha256sum] = "e86697c916019a8588c99b5fac3cead74ec0b4b819707a682fd4d23fa0ce1ba1"
SRC_URI[same-file-1.0.6.sha256sum] = "93fc1dc3aaa9bfed95e02e6eadabb4baf7e3078b0bd1b4d7b6b0b68378900502"
SRC_URI[schemars-0.8.16.sha256sum] = "45a28f4c49489add4ce10783f7911893516f15afe45d015608d41faca6bc4d29"
SRC_URI[schemars-0.8.17.sha256sum] = "7f55c82c700538496bdc329bb4918a81f87cc8888811bd123cf325a0f2f8d309"
SRC_URI[schemars_derive-0.8.16.sha256sum] = "c767fd6fa65d9ccf9cf026122c1b555f2ef9a4f0cea69da4d7dbc3e258d30967"
SRC_URI[schemars_derive-0.8.17.sha256sum] = "83263746fe5e32097f06356968a077f96089739c927a61450efa069905eec108"
SRC_URI[scoped-tls-1.0.1.sha256sum] = "e1cf6437eb19a8f4a6cc0f7dca544973b0b78843adbfeb3683d1a94a0024a294"
SRC_URI[scopeguard-1.2.0.sha256sum] = "94143f37725109f92c262ed2cf5e59bce7498c01bcc1502d7b9afe439a4e9f49"
SRC_URI[seahash-4.1.0.sha256sum] = "1c107b6f4780854c8b126e228ea8869f4d7b71260f962fefb57b996b8959ba6b"
SRC_URI[serde-1.0.200.sha256sum] = "ddc6f9cc94d67c0e21aaf7eda3a010fd3af78ebf6e096aa6e2e13c79749cce4f"
SRC_URI[serde-wasm-bindgen-0.6.5.sha256sum] = "8302e169f0eddcc139c70f139d19d6467353af16f9fce27e8c30158036a1e16b"
SRC_URI[serde_derive-1.0.200.sha256sum] = "856f046b9400cee3c8c94ed572ecdb752444c24528c035cd35882aad6f492bcb"
SRC_URI[serde_derive_internals-0.26.0.sha256sum] = "85bf8229e7920a9f636479437026331ce11aa132b4dde37d121944a44d6e5f3c"
SRC_URI[serde_derive_internals-0.29.0.sha256sum] = "330f01ce65a3a5fe59a60c82f3c9a024b573b8a6e875bd233fe5f934e71d54e3"
SRC_URI[serde_json-1.0.115.sha256sum] = "12dc5c46daa8e9fdf4f5e71b6cf9a53f2487da0e86e55808e2d35539666497dd"
SRC_URI[serde_json-1.0.116.sha256sum] = "3e17db7126d17feb94eb3fad46bf1a96b034e8aacbc2e775fe81505f8b0b2813"
SRC_URI[serde_repr-0.1.18.sha256sum] = "0b2e6b945e9d3df726b65d6ee24060aff8e3533d431f677a9695db04eff9dfdb"
SRC_URI[serde_repr-0.1.19.sha256sum] = "6c64451ba24fc7a6a2d60fc75dd9c83c90903b19028d4eff35e88fc1e86564e9"
SRC_URI[serde_spanned-0.6.5.sha256sum] = "eb3622f419d1296904700073ea6cc23ad690adbd66f13ea683df73298736f0c1"
SRC_URI[serde_test-1.0.176.sha256sum] = "5a2f49ace1498612d14f7e0b8245519584db8299541dfe31a06374a828d620ab"
SRC_URI[serde_with-3.7.0.sha256sum] = "ee80b0e361bbf88fd2f6e242ccd19cfda072cb0faa6ae694ecee08199938569a"
SRC_URI[serde_with-3.8.1.sha256sum] = "0ad483d2ab0149d5a5ebcd9972a3852711e0153d863bf5a5d0391d28883c4a20"
SRC_URI[serde_with_macros-3.7.0.sha256sum] = "6561dc161a9224638a31d876ccdfefbc1df91d3f3a8342eddb35f055d48c7655"
SRC_URI[serde_with_macros-3.8.1.sha256sum] = "65569b702f41443e8bc8bbb1c5779bd0450bbe723b56198980e80ec45780bce2"
SRC_URI[sharded-slab-0.1.7.sha256sum] = "f40ca3c46823713e0d4209592e8d6e826aa57e928f09752619fc696c499637f6"
SRC_URI[shellexpand-3.1.0.sha256sum] = "da03fa3b94cc19e3ebfc88c4229c49d8f08cdbd1228870a45f0ffdf84988e14b"
SRC_URI[shlex-1.3.0.sha256sum] = "0fda2ff0d084019ba4d7c6f371c95d8fd75ce3524c3cb8fb653a3023f6323e64"
SRC_URI[similar-2.5.0.sha256sum] = "fa42c91313f1d05da9b26f267f931cf178d4aba455b4c4622dd7355eb80c6640"
SRC_URI[siphasher-0.3.11.sha256sum] = "38b58827f4464d87d377d175e90bf58eb00fd8716ff0a62f80356b5e61555d0d"
SRC_URI[smallvec-1.13.2.sha256sum] = "3c5e1a9a646d36c3599cd173a41282daf47c44583ad367b8e6837255952e5c67"
SRC_URI[smawk-0.3.2.sha256sum] = "b7c388c1b5e93756d0c740965c41e8822f866621d41acbdf6336a6a168f8840c"
SRC_URI[smol_str-0.2.1.sha256sum] = "e6845563ada680337a52d43bb0b29f396f2d911616f6573012645b9e3d048a49"
SRC_URI[spin-0.9.8.sha256sum] = "6980e8d7511241f8acf4aebddbb1ff938df5eebe98691418c4468d0b72a96a67"
SRC_URI[static_assertions-1.1.0.sha256sum] = "a2eb9349b6444b326872e140eb1cf5e7c522154d69e7a0ffb0fb81c06b37543f"
SRC_URI[strip-ansi-escapes-0.2.0.sha256sum] = "55ff8ef943b384c414f54aefa961dd2bd853add74ec75e7ac74cf91dba62bcfa"
SRC_URI[strsim-0.10.0.sha256sum] = "73473c0e59e6d5812c5dfe2a064a6444949f089e20eec9a2e5506596494e4623"
SRC_URI[strsim-0.11.0.sha256sum] = "5ee073c9e4cd00e28217186dbe12796d692868f432bf2e97ee73bed0c56dfa01"
SRC_URI[strsim-0.11.1.sha256sum] = "7da8b5736845d9f2fcb837ea5d9e2628564b3b043a70948a3f0b778838c5fb4f"
SRC_URI[strum-0.26.2.sha256sum] = "5d8cec3501a5194c432b2b7976db6b7d10ec95c253208b45f83f7136aa985e29"
SRC_URI[strum_macros-0.26.2.sha256sum] = "c6cf59daf282c0a494ba14fd21610a0325f9f90ec9d1231dea26bcb1d696c946"
SRC_URI[subtle-2.5.0.sha256sum] = "81cdd64d312baedb58e21336b31bc043b77e01cc99033ce76ef539f78e965ebc"
SRC_URI[syn-1.0.109.sha256sum] = "72b64191b275b66ffe2469e8af2c1cfe3bafa67b529ead792a6d0160888b4237"
SRC_URI[syn-2.0.59.sha256sum] = "4a6531ffc7b071655e4ce2e04bd464c4830bb585a61cabb96cf808f05172615a"
SRC_URI[syn-2.0.60.sha256sum] = "909518bc7b1c9b779f1bbf07f2929d35af9f0f37e47c6e9ef7f9dddc1e1821f3"
SRC_URI[tempfile-3.10.1.sha256sum] = "85b77fafb263dd9d05cbeac119526425676db3784113aa9295c88498cbf8bff1"
SRC_URI[terminal_size-0.3.0.sha256sum] = "21bebf2b7c9e0a515f6e0f8c51dc0f8e4696391e6f1ff30379559f8365fb0df7"
SRC_URI[terminfo-0.8.0.sha256sum] = "666cd3a6681775d22b200409aad3b089c5b99fb11ecdd8a204d9d62f8148498f"
SRC_URI[test-case-3.3.1.sha256sum] = "eb2550dd13afcd286853192af8601920d959b14c401fcece38071d53bf0768a8"
SRC_URI[test-case-core-3.3.1.sha256sum] = "adcb7fd841cd518e279be3d5a3eb0636409487998a4aff22f3de87b81e88384f"
SRC_URI[test-case-macros-3.3.1.sha256sum] = "5c89e72a01ed4c579669add59014b9a524d609c0c88c6a585ce37485879f6ffb"
SRC_URI[textwrap-0.16.1.sha256sum] = "23d434d3f8967a09480fb04132ebe0a3e088c173e6d0ee7897abbdf4eab0f8b9"
SRC_URI[thiserror-1.0.58.sha256sum] = "03468839009160513471e86a034bb2c5c0e4baae3b43f79ffc55c4a5427b3297"
SRC_URI[thiserror-1.0.59.sha256sum] = "f0126ad08bff79f29fc3ae6a55cc72352056dfff61e3ff8bb7129476d44b23aa"
SRC_URI[thiserror-impl-1.0.58.sha256sum] = "c61f3ba182994efc43764a46c018c347bc492c79f024e705f46567b418f6d4f7"
SRC_URI[thiserror-impl-1.0.59.sha256sum] = "d1cd413b5d558b4c5bf3680e324a6fa5014e7b7c067a51e69dbdf47eb7148b66"
SRC_URI[thread_local-1.1.8.sha256sum] = "8b9ef9bad013ada3808854ceac7b46812a6465ba368859a37e2100283d2d719c"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[tikv-jemallocator-0.5.4.sha256sum] = "965fe0c26be5c56c94e38ba547249074803efd52adfb66de62107d95aab3eaca"
SRC_URI[tinytemplate-1.2.1.sha256sum] = "be4d6b5f19ff7664e8c98d03e2139cb510db9b0a60b55f8e8709b689d939b6bc"
SRC_URI[tinyvec-1.6.0.sha256sum] = "87cc5ceb3875bb20c2890005a4e226a4651264a5c75edb2421b52861a0a0cb50"
SRC_URI[tinyvec_macros-0.1.1.sha256sum] = "1f3ccbac311fea05f86f61904b462b55fb3df8837a366dfc601a0161d0532f20"
SRC_URI[toml-0.8.12.sha256sum] = "e9dd1545e8208b4a5af1aa9bbd0b4cf7e9ea08fabc5d0a5c67fcaafa17433aa3"
SRC_URI[toml_datetime-0.6.5.sha256sum] = "3550f4e9685620ac18a50ed434eb3aec30db8ba93b0287467bca5826ea25baf1"
SRC_URI[toml_edit-0.22.12.sha256sum] = "d3328d4f68a705b2a4498da1d580585d39a6510f98318a2cec3018a7ec61ddef"
SRC_URI[toml_edit-0.22.9.sha256sum] = "8e40bb779c5187258fd7aad0eb68cb8706a0a81fa712fbea808ab43c4b8374c4"
SRC_URI[tracing-0.1.40.sha256sum] = "c3523ab5a71916ccf420eebdf5521fcef02141234bbc0b8a49f2fdc4544364ef"
SRC_URI[tracing-attributes-0.1.27.sha256sum] = "34704c8d6ebcbc939824180af020566b01a7c01f80641264eba0999f6c2b6be7"
SRC_URI[tracing-core-0.1.32.sha256sum] = "c06d3da6113f116aaee68e4d601191614c9053067f9ab7f6edbcb161237daa54"
SRC_URI[tracing-indicatif-0.3.6.sha256sum] = "069580424efe11d97c3fef4197fa98c004fa26672cc71ad8770d224e23b1951d"
SRC_URI[tracing-log-0.2.0.sha256sum] = "ee855f1f400bd0e5c02d150ae5de3840039a3f54b025156404e34c23c03f47c3"
SRC_URI[tracing-subscriber-0.3.18.sha256sum] = "ad0f048c97dbd9faa9b7df56362b8ebcaa52adb06b498c050d2f4e32f90a7a8b"
SRC_URI[tracing-tree-0.3.0.sha256sum] = "65139ecd2c3f6484c3b99bc01c77afe21e95473630747c7aca525e78b0666675"
SRC_URI[typed-arena-2.0.2.sha256sum] = "6af6ae20167a9ece4bcb41af5b80f8a1f1df981f6391189ce00fd257af04126a"
SRC_URI[unic-char-property-0.9.0.sha256sum] = "a8c57a407d9b6fa02b4795eb81c5b6652060a15a7903ea981f3d723e6c0be221"
SRC_URI[unic-char-range-0.9.0.sha256sum] = "0398022d5f700414f6b899e10b8348231abf9173fa93144cbc1a43b9793c1fbc"
SRC_URI[unic-common-0.9.0.sha256sum] = "80d7ff825a6a654ee85a63e80f92f054f904f21e7d12da4e22f9834a4aaa35bc"
SRC_URI[unic-ucd-category-0.9.0.sha256sum] = "1b8d4591f5fcfe1bd4453baaf803c40e1b1e69ff8455c47620440b46efef91c0"
SRC_URI[unic-ucd-version-0.9.0.sha256sum] = "96bd2f2237fe450fcd0a1d2f5f4e91711124f7857ba2e964247776ebeeb7b0c4"
SRC_URI[unicode-bidi-0.3.15.sha256sum] = "08f95100a766bf4f8f28f90d77e0a5461bbdb219042e7679bebe79004fed8d75"
SRC_URI[unicode-ident-1.0.12.sha256sum] = "3354b9ac3fae1ff6755cb6db53683adb661634f67557942dea4facebec0fee4b"
SRC_URI[unicode-linebreak-0.1.5.sha256sum] = "3b09c83c3c29d37506a3e260c08c03743a6bb66a9cd432c6934ab501a190571f"
SRC_URI[unicode-normalization-0.1.23.sha256sum] = "a56d1686db2308d901306f92a263857ef59ea39678a5458e7cb17f01415101f5"
SRC_URI[unicode-width-0.1.11.sha256sum] = "e51733f11c9c4f72aa0c160008246859e340b00807569a0da0e7a1079b27ba85"
SRC_URI[unicode_names2-1.2.2.sha256sum] = "addeebf294df7922a1164f729fb27ebbbcea99cc32b3bf08afab62757f707677"
SRC_URI[unicode_names2_generator-1.2.2.sha256sum] = "f444b8bba042fe3c1251ffaca35c603f2dc2ccc08d595c65a8c4f76f3e8426c0"
SRC_URI[unscanny-0.1.0.sha256sum] = "e9df2af067a7953e9c3831320f35c1cc0600c30d44d9f7a12b01db1cd88d6b47"
SRC_URI[untrusted-0.9.0.sha256sum] = "8ecb6da28b8a351d773b68d5825ac39017e680750f980f3a1a85cd8dd28a47c1"
SRC_URI[ureq-2.9.6.sha256sum] = "11f214ce18d8b2cbe84ed3aa6486ed3f5b285cf8d8fbdbce9f3f767a724adc35"
SRC_URI[ureq-2.9.7.sha256sum] = "d11a831e3c0b56e438a28308e7c810799e3c118417f342d30ecec080105395cd"
SRC_URI[url-2.5.0.sha256sum] = "31e6302e3bb753d46e83516cae55ae196fc0c309407cf11ab35cc51a4c2a4633"
SRC_URI[utf8parse-0.2.1.sha256sum] = "711b9620af191e0cdc7468a8d14e709c3dcdb115b36f838e601583af800a370a"
SRC_URI[uuid-1.8.0.sha256sum] = "a183cf7feeba97b4dd1c0d46788634f6221d87fa961b305bed08c851829efcc0"
SRC_URI[uuid-macro-internal-1.8.0.sha256sum] = "9881bea7cbe687e36c9ab3b778c36cd0487402e270304e8b1296d5085303c1a2"
SRC_URI[valuable-0.1.0.sha256sum] = "830b7e5d4d90034032940e4ace0d9a9a057e7a45cd94e6c007832e39edb82f6d"
SRC_URI[version_check-0.9.4.sha256sum] = "49874b5167b65d7193b8aba1567f5c7d93d001cafc34600cee003eda787e483f"
SRC_URI[vt100-0.15.2.sha256sum] = "84cd863bf0db7e392ba3bd04994be3473491b31e66340672af5d11943c6274de"
SRC_URI[vte-0.11.1.sha256sum] = "f5022b5fbf9407086c180e9557be968742d839e68346af7792b8592489732197"
SRC_URI[vte_generate_state_changes-0.1.1.sha256sum] = "d257817081c7dffcdbab24b9e62d2def62e2ff7d00b1c20062551e6cccc145ff"
SRC_URI[walkdir-2.5.0.sha256sum] = "29790946404f91d9c5d06f9874efddea1dc06c5efe94541a7d6863108e3a5e4b"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasm-bindgen-0.2.92.sha256sum] = "4be2531df63900aeb2bca0daaaddec08491ee64ceecbee5076636a3b026795a8"
SRC_URI[wasm-bindgen-backend-0.2.92.sha256sum] = "614d787b966d3989fa7bb98a654e369c762374fd3213d212cfc0251257e747da"
SRC_URI[wasm-bindgen-futures-0.4.42.sha256sum] = "76bc14366121efc8dbb487ab05bcc9d346b3b5ec0eaa76e46594cabbe51762c0"
SRC_URI[wasm-bindgen-macro-0.2.92.sha256sum] = "a1f8823de937b71b9460c0c34e25f3da88250760bec0ebac694b49997550d726"
SRC_URI[wasm-bindgen-macro-support-0.2.92.sha256sum] = "e94f17b526d0a461a191c78ea52bbce64071ed5c04c9ffe424dcb38f74171bb7"
SRC_URI[wasm-bindgen-shared-0.2.92.sha256sum] = "af190c94f2773fdb3729c55b007a722abb5384da03bc0986df4c289bf5567e96"
SRC_URI[wasm-bindgen-test-0.3.42.sha256sum] = "d9bf62a58e0780af3e852044583deee40983e5886da43a271dd772379987667b"
SRC_URI[wasm-bindgen-test-macro-0.3.42.sha256sum] = "b7f89739351a2e03cb94beb799d47fb2cac01759b40ec441f7de39b00cbf7ef0"
SRC_URI[web-sys-0.3.68.sha256sum] = "96565907687f7aceb35bc5fc03770a8a0471d82e479f25832f54a0e3f4b28446"
SRC_URI[web-sys-0.3.69.sha256sum] = "77afa9a11836342370f4817622a2f0f418b134426d91a82dfb48f532d2ec13ef"
SRC_URI[webpki-roots-0.26.1.sha256sum] = "b3de34ae270483955a94f4b21bdaaeb83d508bb84a01435f393818edb0012009"
SRC_URI[which-6.0.1.sha256sum] = "8211e4f58a2b2805adfbefbc07bab82958fc91e3836339b1ab7ae32465dce0d7"
SRC_URI[wild-2.2.1.sha256sum] = "a3131afc8c575281e1e80f36ed6a092aa502c08b18ed7524e86fbbb12bb410e1"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.6.sha256sum] = "f29e6f9198ba0d26b4c9f07dbe6f9ed633e1f3d5b8b414090084349e46a52596"
SRC_URI[winapi-util-0.1.8.sha256sum] = "4d4cc384e1e73b93bafa6fb4f1df8c41695c8a91cf9c4c64358067d15a7b6c6b"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[windows-core-0.52.0.sha256sum] = "33ab640c8d7e35bf8ba19b884ba838ceb4fba93a4e8c65a9059d08afcfc683d9"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-sys-0.52.0.sha256sum] = "282be5f36a8ce781fad8c8ae18fa3f9beff57ec1b52cb3de0789201425d9a33d"
SRC_URI[windows-targets-0.48.5.sha256sum] = "9a2fa6e2155d7247be68c096456083145c183cbbbc2764150dda45a87197940c"
SRC_URI[windows-targets-0.52.4.sha256sum] = "7dd37b7e5ab9018759f893a1952c9420d060016fc19a472b4bb20d1bdd694d1b"
SRC_URI[windows-targets-0.52.5.sha256sum] = "6f0713a46559409d202e70e28227288446bf7841d3211583a4b53e3f6d96e7eb"
SRC_URI[windows_aarch64_gnullvm-0.48.5.sha256sum] = "2b38e32f0abccf9987a4e3079dfb67dcd799fb61361e53e2882c3cbaf0d905d8"
SRC_URI[windows_aarch64_gnullvm-0.52.4.sha256sum] = "bcf46cf4c365c6f2d1cc93ce535f2c8b244591df96ceee75d8e83deb70a9cac9"
SRC_URI[windows_aarch64_gnullvm-0.52.5.sha256sum] = "7088eed71e8b8dda258ecc8bac5fb1153c5cffaf2578fc8ff5d61e23578d3263"
SRC_URI[windows_aarch64_msvc-0.48.5.sha256sum] = "dc35310971f3b2dbbf3f0690a219f40e2d9afcf64f9ab7cc1be722937c26b4bc"
SRC_URI[windows_aarch64_msvc-0.52.4.sha256sum] = "da9f259dd3bcf6990b55bffd094c4f7235817ba4ceebde8e6d11cd0c5633b675"
SRC_URI[windows_aarch64_msvc-0.52.5.sha256sum] = "9985fd1504e250c615ca5f281c3f7a6da76213ebd5ccc9561496568a2752afb6"
SRC_URI[windows_i686_gnu-0.48.5.sha256sum] = "a75915e7def60c94dcef72200b9a8e58e5091744960da64ec734a6c6e9b3743e"
SRC_URI[windows_i686_gnu-0.52.4.sha256sum] = "b474d8268f99e0995f25b9f095bc7434632601028cf86590aea5c8a5cb7801d3"
SRC_URI[windows_i686_gnu-0.52.5.sha256sum] = "88ba073cf16d5372720ec942a8ccbf61626074c6d4dd2e745299726ce8b89670"
SRC_URI[windows_i686_gnullvm-0.52.5.sha256sum] = "87f4261229030a858f36b459e748ae97545d6f1ec60e5e0d6a3d32e0dc232ee9"
SRC_URI[windows_i686_msvc-0.48.5.sha256sum] = "8f55c233f70c4b27f66c523580f78f1004e8b5a8b659e05a4eb49d4166cca406"
SRC_URI[windows_i686_msvc-0.52.4.sha256sum] = "1515e9a29e5bed743cb4415a9ecf5dfca648ce85ee42e15873c3cd8610ff8e02"
SRC_URI[windows_i686_msvc-0.52.5.sha256sum] = "db3c2bf3d13d5b658be73463284eaf12830ac9a26a90c717b7f771dfe97487bf"
SRC_URI[windows_x86_64_gnu-0.48.5.sha256sum] = "53d40abd2583d23e4718fddf1ebec84dbff8381c07cae67ff7768bbf19c6718e"
SRC_URI[windows_x86_64_gnu-0.52.4.sha256sum] = "5eee091590e89cc02ad514ffe3ead9eb6b660aedca2183455434b93546371a03"
SRC_URI[windows_x86_64_gnu-0.52.5.sha256sum] = "4e4246f76bdeff09eb48875a0fd3e2af6aada79d409d33011886d3e1581517d9"
SRC_URI[windows_x86_64_gnullvm-0.48.5.sha256sum] = "0b7b52767868a23d5bab768e390dc5f5c55825b6d30b86c844ff2dc7414044cc"
SRC_URI[windows_x86_64_gnullvm-0.52.4.sha256sum] = "77ca79f2451b49fa9e2af39f0747fe999fcda4f5e241b2898624dca97a1f2177"
SRC_URI[windows_x86_64_gnullvm-0.52.5.sha256sum] = "852298e482cd67c356ddd9570386e2862b5673c85bd5f88df9ab6802b334c596"
SRC_URI[windows_x86_64_msvc-0.48.5.sha256sum] = "ed94fce61571a4006852b7389a063ab983c02eb1bb37b47f8272ce92d06d9538"
SRC_URI[windows_x86_64_msvc-0.52.4.sha256sum] = "32b752e52a2da0ddfbdbcc6fceadfeede4c939ed16d13e648833a61dfb611ed8"
SRC_URI[windows_x86_64_msvc-0.52.5.sha256sum] = "bec47e5bfd1bff0eeaf6d8b485cc1074891a197ab4225d504cb7a1ab88b02bf0"
SRC_URI[winnow-0.6.5.sha256sum] = "dffa400e67ed5a4dd237983829e66475f0a4a26938c4b04c21baede6262215b8"
SRC_URI[winnow-0.6.6.sha256sum] = "f0c976aaaa0e1f90dbb21e9587cdaf1d9679a1cde8875c0d6bd83ab96a208352"
SRC_URI[winsafe-0.0.19.sha256sum] = "d135d17ab770252ad95e9a872d365cf3090e3be864a34ab46f48555993efc904"
SRC_URI[yansi-0.5.1.sha256sum] = "09041cd90cf85f7f8b2df60c646f853b7f535ce68f85244eb6731cf89fa498ec"
SRC_URI[yansi-term-0.1.2.sha256sum] = "fe5c30ade05e61656247b2e334a031dfd0cc466fadef865bdcdea8d537951bf1"
SRC_URI[zerocopy-0.7.32.sha256sum] = "74d4d3961e53fa4c9a25a8637fc2bfaf2595b3d3ae34875568a5cf64787716be"
SRC_URI[zerocopy-derive-0.7.32.sha256sum] = "9ce1b18ccd8e73a9321186f97e46f9f04b778851177567b1975109d26a08d2a6"
SRC_URI[zeroize-1.7.0.sha256sum] = "525b4ec142c6b68a2d10f01f7bbf6755599ca3f81ea53b8431b7dd348f5fdb2d"

inherit sca-description
inherit pypi
inherit python_maturin
inherit_defer nativesdk
SRC_URI:append = " ${CRATES_LIST}"
SCA_TOOL_DESCRIPTION = "ruff"
INSANE_SKIP:${PN} += "already-stripped"
