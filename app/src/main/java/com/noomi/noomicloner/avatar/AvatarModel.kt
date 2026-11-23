package com.noomi.noomicloner.avatar

import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.listSaver
import kotlin.random.Random

data class ColorSwatch(val label: String, val argb: Int)

enum class HeadShape(val label: String) {
    OVAL("Овал"),
    ROUND("Круглая"),
    ANGULAR("Угловатая"),
    HEART("Сердечко")
}

enum class EyeStyle(val label: String) {
    KIND("Добрые"),
    SLY("Хитрые"),
    CYBER("Кибер-очки"),
    ANIME("Аниме")
}

enum class MouthStyle(val label: String) {
    SMILE("Улыбка"),
    SMIRK("Ухмылка"),
    SURPRISE("Удивление"),
    POKER("Покерфейс")
}

enum class HairStyle(val label: String) {
    SHORT("Короткие"),
    BOB("Каре"),
    LONG("Длинные"),
    SPIKY("Шипы"),
    MOHAWK("Ирокез"),
    TWIN_TAILS("Хвостики"),
    CURLY("Кудри"),
    BUZZ("Ёжик")
}

enum class OutfitStyle(val label: String) {
    HOODIE("Худи"),
    TSHIRT("Футболка"),
    ARMOR("Броня"),
    JACKET("Пиджак")
}

enum class Accessory(val label: String) {
    CAP("Кепка"),
    HEADPHONES("Наушники"),
    CROWN("Корона"),
    HORNS("Рожки"),
    MASK("Маска"),
    WINGS("Крылья"),
    PET("Питомец")
}

enum class BackgroundStyle(
    val label: String,
    val colors: List<Int>,
    val accent: Int
) {
    CYBER_NIGHT("Кибер-ночь", listOf(0xFF0F0C29.toInt(), 0xFF302B63.toInt(), 0xFF24243E.toInt()), 0xFF00F5D4.toInt()),
    NEON_SUNSET("Неон-закат", listOf(0xFFFF006E.toInt(), 0xFF8338EC.toInt(), 0xFF3A86FF.toInt()), 0xFFFFBE0B.toInt()),
    MINT_LAB("Мята", listOf(0xFF003049.toInt(), 0xFF006D77.toInt(), 0xFF00F5D4.toInt()), 0xFFC7F9CC.toInt()),
    VIOLET_HAZE("Фиолет", listOf(0xFF240046.toInt(), 0xFF5A189A.toInt(), 0xFF9D4EDD.toInt()), 0xFFFF9E00.toInt()),
    VAPORWAVE("Вейпорвейв", listOf(0xFF2D00F7.toInt(), 0xFFF20089.toInt(), 0xFF00B4D8.toInt()), 0xFFFFD60A.toInt()),
    DEEP_OCEAN("Океан", listOf(0xFF03045E.toInt(), 0xFF0077B6.toInt(), 0xFF00B4D8.toInt()), 0xFF90E0EF.toInt()),
    SOLAR_FIRE("Солар", listOf(0xFF370617.toInt(), 0xFFD00000.toInt(), 0xFFFFBA08.toInt()), 0xFFFFF3B0.toInt()),
    AURORA("Аврора", listOf(0xFF001219.toInt(), 0xFF005F73.toInt(), 0xFF0A9396.toInt()), 0xFF94D2BD.toInt()),
    CANDY_CLOUD("Карамель", listOf(0xFF4A0E4E.toInt(), 0xFFC9184A.toInt(), 0xFFFF8FAB.toInt()), 0xFFFFD6E0.toInt()),
    MIDNIGHT("Полночь", listOf(0xFF05050B.toInt(), 0xFF13132B.toInt(), 0xFF29294D.toInt()), 0xFF7B61FF.toInt())
}

val SKIN_TONES = listOf(
    ColorSwatch("Фарфор", 0xFFFFE3D6.toInt()),
    ColorSwatch("Светлый", 0xFFF7CFB4.toInt()),
    ColorSwatch("Персик", 0xFFEAB38F.toInt()),
    ColorSwatch("Бежевый", 0xFFD99B72.toInt()),
    ColorSwatch("Оливковый", 0xFFC1865E.toInt()),
    ColorSwatch("Золотистый", 0xFFA96845.toInt()),
    ColorSwatch("Карамель", 0xFF8D5638.toInt()),
    ColorSwatch("Бронза", 0xFF72422B.toInt()),
    ColorSwatch("Какао", 0xFF5A3222.toInt()),
    ColorSwatch("Шоколад", 0xFF422419.toInt()),
    ColorSwatch("Эбен", 0xFF2C1711.toInt()),
    ColorSwatch("Лаванда", 0xFFC7B8E8.toInt()),
    ColorSwatch("Мята", 0xFFB8E8D8.toInt()),
    ColorSwatch("Розовый", 0xFFF4B8C8.toInt())
)

val HAIR_COLORS = listOf(
    ColorSwatch("Чёрный", 0xFF13131C.toInt()),
    ColorSwatch("Тёмный шоколад", 0xFF3A241D.toInt()),
    ColorSwatch("Каштан", 0xFF6A3E2B.toInt()),
    ColorSwatch("Медь", 0xFFB65A36.toInt()),
    ColorSwatch("Блонд", 0xFFE8C77B.toInt()),
    ColorSwatch("Платина", 0xFFF2E6D8.toInt()),
    ColorSwatch("Неон-бирюза", 0xFF00E5C3.toInt()),
    ColorSwatch("Неон-розовый", 0xFFFF3D9A.toInt()),
    ColorSwatch("Фиолет", 0xFF8A5CFF.toInt()),
    ColorSwatch("Огонь", 0xFFFF6B35.toInt()),
    ColorSwatch("Лёд", 0xFF9BD8FF.toInt())
)

val OUTFIT_COLORS = listOf(
    ColorSwatch("Графит", 0xFF202333.toInt()),
    ColorSwatch("Молоко", 0xFFEDEDF5.toInt()),
    ColorSwatch("Неон-бирюза", 0xFF00D9C0.toInt()),
    ColorSwatch("Неон-розовый", 0xFFFF2E88.toInt()),
    ColorSwatch("Ультрафиолет", 0xFF7B61FF.toInt()),
    ColorSwatch("Электрик", 0xFF2E8BFF.toInt()),
    ColorSwatch("Лайм", 0xFFB7FF3C.toInt()),
    ColorSwatch("Золото", 0xFFFFC53D.toInt()),
    ColorSwatch("Красный", 0xFFE63946.toInt()),
    ColorSwatch("Бирюзовый", 0xFF1D7874.toInt())
)

data class AvatarState(
    val headShape: HeadShape = HeadShape.OVAL,
    val skin: Int = 1,
    val eyes: EyeStyle = EyeStyle.KIND,
    val mouth: MouthStyle = MouthStyle.SMILE,
    val hair: HairStyle = HairStyle.SHORT,
    val hairColor: Int = 1,
    val outfit: OutfitStyle = OutfitStyle.HOODIE,
    val outfitColor: Int = 2,
    val accessories: Set<Accessory> = setOf(Accessory.HEADPHONES),
    val background: BackgroundStyle = BackgroundStyle.CYBER_NIGHT
) {
    companion object {
        val Default = AvatarState()

        fun random(): AvatarState {
            val random = Random.Default
            val accessoryPool = Accessory.entries.shuffled(random)
            val chosenAccessories = accessoryPool
                .take(random.nextInt(0, 4))
                .toSet()

            return AvatarState(
                headShape = HeadShape.entries.random(random),
                skin = SKIN_TONES.indices.random(random),
                eyes = EyeStyle.entries.random(random),
                mouth = MouthStyle.entries.random(random),
                hair = HairStyle.entries.random(random),
                hairColor = HAIR_COLORS.indices.random(random),
                outfit = OutfitStyle.entries.random(random),
                outfitColor = OUTFIT_COLORS.indices.random(random),
                accessories = chosenAccessories,
                background = BackgroundStyle.entries.random(random)
            )
        }
    }
}

val AvatarStateSaver: Saver<AvatarState, Any> = listSaver(
    save = { state ->
        listOf(
            state.headShape.ordinal,
            state.skin,
            state.eyes.ordinal,
            state.mouth.ordinal,
            state.hair.ordinal,
            state.hairColor,
            state.outfit.ordinal,
            state.outfitColor,
            state.accessories.fold(0) { mask, accessory ->
                mask or (1 shl accessory.ordinal)
            },
            state.background.ordinal
        )
    },
    restore = { values ->
        val accessoryMask = values.getOrElse(8) { 0 }
        AvatarState(
            headShape = HeadShape.entries.getOrElse(values.getOrElse(0) { 0 }) { HeadShape.OVAL },
            skin = values.getOrElse(1) { 1 }.coerceIn(SKIN_TONES.indices),
            eyes = EyeStyle.entries.getOrElse(values.getOrElse(2) { 0 }) { EyeStyle.KIND },
            mouth = MouthStyle.entries.getOrElse(values.getOrElse(3) { 0 }) { MouthStyle.SMILE },
            hair = HairStyle.entries.getOrElse(values.getOrElse(4) { 0 }) { HairStyle.SHORT },
            hairColor = values.getOrElse(5) { 1 }.coerceIn(HAIR_COLORS.indices),
            outfit = OutfitStyle.entries.getOrElse(values.getOrElse(6) { 0 }) { OutfitStyle.HOODIE },
            outfitColor = values.getOrElse(7) { 0 }.coerceIn(OUTFIT_COLORS.indices),
            accessories = Accessory.entries.filter { accessory ->
                accessoryMask and (1 shl accessory.ordinal) != 0
            }.toSet(),
            background = BackgroundStyle.entries.getOrElse(values.getOrElse(9) { 0 }) { BackgroundStyle.CYBER_NIGHT }
        )
    }
)
