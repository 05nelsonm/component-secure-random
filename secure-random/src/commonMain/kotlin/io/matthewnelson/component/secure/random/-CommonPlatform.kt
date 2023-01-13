/*
 * Copyright (c) 2023 Matthew Nelson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/
package io.matthewnelson.component.secure.random

public class SecRandomCopyException: RuntimeException {
    public constructor(): super()
    public constructor(message: String?): super(message)
    public constructor(message: String?, cause: Throwable?): super(message, cause)
    public constructor(cause: Throwable?): super(cause)
}

public expect open class GeneralSecurityException: Exception {
    public constructor()
    public constructor(message: String?)
    public constructor(message: String?, cause: Throwable?)
    public constructor(cause: Throwable?)
}

public expect open class NoSuchAlgorithmException: GeneralSecurityException {
    public constructor()
    public constructor(message: String?)
    public constructor(message: String?, cause: Throwable?)
    public constructor(cause: Throwable?)
}
