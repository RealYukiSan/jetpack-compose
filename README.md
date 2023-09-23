Practice building simple android apps with jetpack compose from [developer android site](https://developer.android.com/courses/pathways/android-basics-compose-unit-1-pathway-3)

See branch section for other apps.

One thing that I realize from this case is that the [order of modifier chain](https://developer.android.com/jetpack/compose/modifiers#weight-in-row-and-column:~:text=Their%20ordering%20matters) actually matters and can affect the behavior of the UI.
[Just keep in mind that the order of modifiers matters!](https://developer.android.com/jetpack/compose/modifiers#best_practices_for_reusing_modifiers:~:text=Just%20keep%20in%20mind%20that%20the%20order%20of%20modifiers%20matters!)

also, weight in jetpack compose refer to size? wait? what?! saia tidak terlalu familiar dengan ini - from css perspective :v

[but is seems only available on Column Scope and Row Scope](https://developer.android.com/jetpack/compose/modifiers#weight-in-row-and-column:~:text=Modifier%20that%20is%20only%20available%20in)

also there are some modifier that only available on [Box Scope](https://developer.android.com/jetpack/compose/modifiers#scope-safety:~:text=is%20only%20available%20in%20BoxScope.)