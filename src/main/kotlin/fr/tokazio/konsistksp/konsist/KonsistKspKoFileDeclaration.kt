package fr.tokazio.konsistksp.konsist

import com.google.devtools.ksp.symbol.FileLocation
import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSFile
import com.google.devtools.ksp.symbol.Origin
import com.lemonappdev.konsist.api.declaration.*
import com.lemonappdev.konsist.api.declaration.combined.KoClassAndInterfaceAndObjectDeclaration
import com.lemonappdev.konsist.api.declaration.combined.KoClassAndInterfaceDeclaration
import com.lemonappdev.konsist.api.declaration.combined.KoClassAndObjectDeclaration
import com.lemonappdev.konsist.api.declaration.combined.KoInterfaceAndObjectDeclaration
import fr.tokazio.konsistksp.logger.KonsistKspLogger
import java.io.File
import kotlin.reflect.KClass

class KonsistKspKoFileDeclaration(
  private val logger: KonsistKspLogger,
  val ksFile: KSFile,
) : KoFileDeclaration {
  override val annotations: List<KoAnnotationDeclaration>
    get() = ksFile.annotations
      .map { ksAnnotation: KSAnnotation ->
        KonsistKspKoAnnotationDeclaration(logger, ksAnnotation)
      }.toList()
  override val extension: String
    get() = "kt"
  override val hasMatchingPackage: Boolean
    get() = TODO("Not yet implemented")
  override val importAliases: List<KoImportAliasDeclaration>
    get() = TODO("Not yet implemented")
  override val imports: List<KoImportDeclaration>
    get() = getImportsFromSourceFile(ksFile)
  override val moduleName: String
    get() = TODO("Not yet implemented")
  override val name: String
    get() = ksFile.fileName.substringBeforeLast('.')
  override val nameWithExtension: String
    get() = ksFile.fileName
  override val numAnnotations: Int
    get() = TODO("Not yet implemented")
  override val numImportAliases: Int
    get() = TODO("Not yet implemented")
  override val numImports: Int
    get() = TODO("Not yet implemented")
  override val numTypeAliases: Int
    get() = TODO("Not yet implemented")
  override val packagee: KoPackageDeclaration?
    get() = TODO("Not yet implemented")
  override val path: String
    get() = ksFile.filePath
  override val projectPath: String
    get() = TODO("Not yet implemented")
  override val sourceSetName: String
    get() = TODO("Not yet implemented")
  override val text: String
    get() = TODO("Not yet implemented")
  override val typeAliases: List<KoTypeAliasDeclaration>
    get() = TODO("Not yet implemented")

  override fun classes(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): List<KoClassDeclaration> {
    TODO("Not yet implemented")
  }

  override fun classesAndInterfaces(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): List<KoClassAndInterfaceDeclaration> {
    TODO("Not yet implemented")
  }

  override fun classesAndInterfacesAndObjects(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): List<KoClassAndInterfaceAndObjectDeclaration> {
    TODO("Not yet implemented")
  }

  override fun classesAndObjects(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): List<KoClassAndObjectDeclaration> {
    TODO("Not yet implemented")
  }

  override fun countAnnotations(predicate: (KoAnnotationDeclaration) -> Boolean): Int {
    TODO("Not yet implemented")
  }

  override fun countClasses(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoClassDeclaration) -> Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun countClassesAndInterfaces(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoClassAndInterfaceDeclaration) -> Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun countClassesAndInterfacesAndObjects(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoClassAndInterfaceAndObjectDeclaration) -> Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun countClassesAndObjects(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoClassAndObjectDeclaration) -> Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun countDeclarations(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoBaseDeclaration) -> Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun countFunctions(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoFunctionDeclaration) -> Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun countImportAliases(predicate: (KoImportAliasDeclaration) -> Boolean): Int {
    TODO("Not yet implemented")
  }

  override fun countImports(predicate: (KoImportDeclaration) -> Boolean): Int {
    TODO("Not yet implemented")
  }

  override fun countInterfaces(
    includeNested: Boolean,
    predicate: (KoInterfaceDeclaration) -> Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun countInterfacesAndObjects(
    includeNested: Boolean,
    predicate: (KoInterfaceAndObjectDeclaration) -> Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun countObjects(
    includeNested: Boolean,
    predicate: (KoObjectDeclaration) -> Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun countProperties(
    includeNested: Boolean,
    predicate: (KoPropertyDeclaration) -> Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun countTypeAliases(predicate: (KoTypeAliasDeclaration) -> Boolean): Int {
    TODO("Not yet implemented")
  }

  override fun declarations(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): List<KoBaseDeclaration> {
    TODO("Not yet implemented")
  }

  override fun equals(other: Any?): Boolean {
    TODO("Not yet implemented")
  }

  override fun functions(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): List<KoFunctionDeclaration> {
    TODO("Not yet implemented")
  }

  override fun hasAllAnnotations(predicate: (KoAnnotationDeclaration) -> Boolean): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllAnnotationsOf(names: Collection<KClass<*>>): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllAnnotationsOf(
    name: KClass<*>,
    vararg names: KClass<*>,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllClasses(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoClassDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllClassesAndInterfaces(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoClassAndInterfaceDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllClassesAndInterfacesAndObjects(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoClassAndInterfaceAndObjectDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllClassesAndObjects(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoClassAndObjectDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllDeclarations(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoBaseDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllFunctions(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoFunctionDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllImportAliases(predicate: (KoImportAliasDeclaration) -> Boolean): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllImports(predicate: (KoImportDeclaration) -> Boolean): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllInterfaces(
    includeNested: Boolean,
    predicate: (KoInterfaceDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllInterfacesAndObjects(
    includeNested: Boolean,
    predicate: (KoInterfaceAndObjectDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllObjects(
    includeNested: Boolean,
    predicate: (KoObjectDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllProperties(
    includeNested: Boolean,
    predicate: (KoPropertyDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAllTypeAliases(predicate: (KoTypeAliasDeclaration) -> Boolean): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAnnotation(predicate: (KoAnnotationDeclaration) -> Boolean): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAnnotationOf(names: Collection<KClass<*>>): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAnnotationOf(
    name: KClass<*>,
    vararg names: KClass<*>,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAnnotationWithName(
    name: String,
    vararg names: String,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAnnotationWithName(names: Collection<String>): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAnnotations(): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAnnotationsWithAllNames(
    name: String,
    vararg names: String,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasAnnotationsWithAllNames(names: Collection<String>): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClass(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoClassDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassOrInterface(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoClassAndInterfaceDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassOrInterfaceOrObject(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoClassAndInterfaceAndObjectDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassOrInterfaceOrObjectWithName(
    name: String,
    vararg names: String,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassOrInterfaceOrObjectWithName(
    names: Collection<String>,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassOrInterfaceWithName(
    name: String,
    vararg names: String,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassOrInterfaceWithName(
    names: Collection<String>,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassOrObject(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoClassAndObjectDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassOrObjectWithName(
    name: String,
    vararg names: String,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassOrObjectWithName(
    names: Collection<String>,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassWithName(
    name: String,
    vararg names: String,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassWithName(
    names: Collection<String>,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClasses(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassesAndInterfacesAndObjectsWithAllNames(
    name: String,
    vararg names: String,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassesAndInterfacesAndObjectsWithAllNames(
    names: Collection<String>,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassesAndInterfacesWithAllNames(
    name: String,
    vararg names: String,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassesAndInterfacesWithAllNames(
    names: Collection<String>,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassesAndObjectsWithAllNames(
    name: String,
    vararg names: String,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassesAndObjectsWithAllNames(
    names: Collection<String>,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassesOrInterfaces(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassesOrInterfacesOrObjects(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassesOrObjects(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassesWithAllNames(
    name: String,
    vararg names: String,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasClassesWithAllNames(
    names: Collection<String>,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasDeclaration(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoBaseDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasDeclarations(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasExtension(extension: String): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasFunction(
    includeNested: Boolean,
    includeLocal: Boolean,
    predicate: (KoFunctionDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasFunctionWithName(
    name: String,
    vararg names: String,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasFunctionWithName(
    names: Collection<String>,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasFunctions(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasFunctionsWithAllNames(
    name: String,
    vararg names: String,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasFunctionsWithAllNames(
    names: Collection<String>,
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasImport(predicate: (KoImportDeclaration) -> Boolean): Boolean =
    imports.firstOrNull { koImportDeclaration: KoImportDeclaration ->
      predicate(koImportDeclaration)
    } != null

  override fun hasImportAlias(predicate: (KoImportAliasDeclaration) -> Boolean): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasImportAliasWithName(
    name: String,
    vararg names: String,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasImportAliasWithName(names: Collection<String>): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasImportAliases(): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasImportAliasesWithAllNames(
    name: String,
    vararg names: String,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasImportAliasesWithAllNames(names: Collection<String>): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasImportWithName(
    name: String,
    vararg names: String,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasImportWithName(names: Collection<String>): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasImports(): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasImportsWithAllNames(
    name: String,
    vararg names: String,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasImportsWithAllNames(names: Collection<String>): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasInterface(
    includeNested: Boolean,
    predicate: (KoInterfaceDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasInterfaceOrObject(
    includeNested: Boolean,
    predicate: (KoInterfaceAndObjectDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasInterfaceOrObjectWithName(
    name: String,
    vararg names: String,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasInterfaceOrObjectWithName(
    names: Collection<String>,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasInterfaceWithName(
    name: String,
    vararg names: String,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasInterfaceWithName(
    names: Collection<String>,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasInterfaces(includeNested: Boolean): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasInterfacesAndObjectsWithAllNames(
    name: String,
    vararg names: String,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasInterfacesAndObjectsWithAllNames(
    names: Collection<String>,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasInterfacesOrObjects(includeNested: Boolean): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasInterfacesWithAllNames(
    name: String,
    vararg names: String,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasInterfacesWithAllNames(
    names: Collection<String>,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasNameContaining(text: String): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasNameEndingWith(suffix: String): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasNameMatching(regex: Regex): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasNameStartingWith(prefix: String): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasObject(
    includeNested: Boolean,
    predicate: (KoObjectDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasObjectWithName(
    name: String,
    vararg names: String,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasObjectWithName(
    names: Collection<String>,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasObjects(includeNested: Boolean): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasObjectsWithAllNames(
    name: String,
    vararg names: String,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasObjectsWithAllNames(
    names: Collection<String>,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasPackage(name: String): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasProperties(includeNested: Boolean): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasPropertiesWithAllNames(
    name: String,
    vararg names: String,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasPropertiesWithAllNames(
    names: Collection<String>,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasProperty(
    includeNested: Boolean,
    predicate: (KoPropertyDeclaration) -> Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasPropertyWithName(
    name: String,
    vararg names: String,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasPropertyWithName(
    names: Collection<String>,
    includeNested: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasTextContaining(str: String): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasTextEndingWith(suffix: String): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasTextMatching(regex: Regex): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasTextStartingWith(prefix: String): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasTypeAlias(predicate: (KoTypeAliasDeclaration) -> Boolean): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasTypeAliasWithName(
    name: String,
    vararg names: String,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasTypeAliasWithName(names: Collection<String>): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasTypeAliases(): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasTypeAliasesWithAllNames(
    name: String,
    vararg names: String,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun hasTypeAliasesWithAllNames(names: Collection<String>): Boolean {
    TODO("Not yet implemented")
  }

  override fun hashCode(): Int = ksFile.hashCode()

  override fun interfaces(includeNested: Boolean): List<KoInterfaceDeclaration> {
    TODO("Not yet implemented")
  }

  override fun interfacesAndObjects(includeNested: Boolean): List<KoInterfaceAndObjectDeclaration> {
    TODO("Not yet implemented")
  }

  override fun numClasses(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun numClassesAndInterfaces(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun numClassesAndInterfacesAndObjects(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun numClassesAndObjects(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun numDeclarations(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun numFunctions(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun numInterfaces(includeNested: Boolean): Int {
    TODO("Not yet implemented")
  }

  override fun numInterfacesAndObjects(includeNested: Boolean): Int {
    TODO("Not yet implemented")
  }

  override fun numInternalDeclarations(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun numObjects(includeNested: Boolean): Int {
    TODO("Not yet implemented")
  }

  override fun numPrivateDeclarations(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun numProperties(includeNested: Boolean): Int {
    TODO("Not yet implemented")
  }

  override fun numProtectedDeclarations(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun numPublicDeclarations(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun numPublicOrDefaultDeclarations(
    includeNested: Boolean,
    includeLocal: Boolean,
  ): Int {
    TODO("Not yet implemented")
  }

  override fun objects(includeNested: Boolean): List<KoObjectDeclaration> {
    TODO("Not yet implemented")
  }

  override fun properties(includeNested: Boolean): List<KoPropertyDeclaration> {
    TODO("Not yet implemented")
  }

  override fun resideInModule(name: String): Boolean {
    TODO("Not yet implemented")
  }

  override fun resideInPath(
    path: String,
    absolutePath: Boolean,
  ): Boolean {
    TODO("Not yet implemented")
  }

  override fun resideInSourceSet(sourceSetName: String): Boolean {
    TODO("Not yet implemented")
  }

  override fun toString(): String = "${ksFile.filePath}${File.pathSeparatorChar}${ksFile.fileName}"

  /*
  private fun getReferencedTypes(ksFile: KSFile): Set<KoImportDeclaration> {
    val referencedTypes = mutableSetOf<KoImportDeclaration>()

    ksFile.declarations.forEach { declaration ->
      when (declaration) {
        is KSClassDeclaration    -> {
          // Collect superclass types
          declaration.superTypes.forEach { superType ->
            superType.resolve().declaration.qualifiedName?.asString()
              ?.let {
                referencedTypes.add(
                  KonsistKspKoImportDeclaration(
                    it
                  )
                )
              }
          }

          // Collect property types
          declaration.getAllProperties()
            .forEach { property ->
              property.type.resolve().declaration.qualifiedName?.asString()
                ?.let {
                  referencedTypes.add(
                    KonsistKspKoImportDeclaration(
                      it
                    )
                  )
                }
            }
        }

        is KSFunctionDeclaration -> {
          // Collect parameter and return types
          declaration.parameters.forEach { param ->
            param.type.resolve().declaration.qualifiedName?.asString()
              ?.let {
                referencedTypes.add(
                  KonsistKspKoImportDeclaration(
                    it
                  )
                )
              }
          }
        }
      }
    }

    return referencedTypes
  }

   */

  private fun getImportsFromSourceFile(ksFile: KSFile): List<KoImportDeclaration> {
    val imports = mutableListOf<KoImportDeclaration>()

    // Split content into lines
    val lines = File(ksFile.filePath)
      .readText()
      .lines()

    var inMultiLineComment = false

    for (lineNum in 0..lines.size) {
      val line = lines[lineNum]
      val trimmedLine = line.trim()

      // Skip empty lines
      if (trimmedLine.isEmpty()) continue

      // Handle multi-line comments
      if (trimmedLine.startsWith("/*")) {
        inMultiLineComment = true
        if (trimmedLine.contains("*/")) {
          inMultiLineComment = false
        }
        continue
      }

      if (inMultiLineComment) {
        if (trimmedLine.contains("*/")) {
          inMultiLineComment = false
        }
        continue
      }

      // Skip single-line comments
      if (trimmedLine.startsWith("//")) continue

      // Check for import statements
      if (trimmedLine.startsWith("import ")) {
        val importStatement = extractImportStatement(trimmedLine)
        if (importStatement.isNotEmpty()) {
          imports.add(
            KonsistKspKoImportDeclaration(
              ksImport = KSImport(
                location = FileLocation(
                  filePath = ksFile.filePath,
                  lineNumber = lineNum + 1,
                ),
                origin = Origin.KOTLIN,
                parent = ksFile,
              ),
              importString = importStatement,
            ),
          )
        }
      }

      // Stop parsing imports when we hit the first non-import, non-comment, non-package declaration
      if (!trimmedLine.startsWith("package ") &&
        !trimmedLine.startsWith("import ") &&
        !trimmedLine.startsWith("@file:") &&
        !trimmedLine.startsWith("/*") &&
        !trimmedLine.startsWith("//") &&
        !trimmedLine.startsWith("*/")
      ) {
        break
      }
    }

    return imports
  }

  private fun extractImportStatement(line: String): String =
    try {
      // Remove "import " prefix
      var importPath = line
        .substring(6)
        .trim()

      // Handle import aliases (import com.example.LongName as Short)
      val asIndex = importPath.indexOf(" as ")
      if (asIndex != -1) {
        importPath = importPath
          .substring(0, asIndex)
          .trim()
      }

      // Remove semicolon if present (shouldn't be in Kotlin, but just in case)
      if (importPath.endsWith(";")) {
        importPath = importPath.substring(0, importPath.length - 1)
      }

      importPath
    } catch (e: Exception) {
      logger.warn("Failed to parse import statement: $line")
      ""
    }
}
