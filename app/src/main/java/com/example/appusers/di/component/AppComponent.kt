package com.example.appusers.di.component

import com.example.appusers.base.BaseApp
import com.example.appusers.di.modules.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [AndroidSupportInjectionModule::class,
            AppModule::class,
            AppBindingModule::class,
            NetworkModule::class,
            DatabaseModule::class,
            ViewModelModule::class,
            ApiServiceModule::class,
            RepositoryModule::class,
            DataSourcesModule::class]
)
interface AppComponent : AndroidInjector<BaseApp> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: BaseApp): Builder

        fun build(): AppComponent
    }


}