package com.bb.bigbasketsalesapp;

import com.bb.bigbasketsalesapp.di.AppModule;
import com.bb.bigbasketsalesapp.ui.MainActivity_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.TargetVsSalesFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.changePasswordLogin.ChangePasswordLogin_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.customersList.CustomersListFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.followUps.AddFollowUpsFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.followUps.FollowUpListFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.home.HomeFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.AddCustomerFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.BasicDetailsFormFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.BusinessDetailsFormFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.EditCustomerFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.ChatFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.MessageListFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.NotificationListFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.NotificationsMessagesFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.viewModel.ChatViewModel_HiltModules;
import com.bb.bigbasketsalesapp.ui.fragments.offers.OffersFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.productList.ProductListFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.profile.EditProfileFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.profile.ProfileFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.revenue.RevenueFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.fragments.statistics.StatisticsFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.loginSignUp.ChangePasswordFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.loginSignUp.ForgotPasswordFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.loginSignUp.LoginFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.loginSignUp.LoginSignupActivity_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.loginSignUp.OTPFragment_GeneratedInjector;
import com.bb.bigbasketsalesapp.ui.viewModel.LoginViewModel_HiltModules;
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel_HiltModules;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.inject.Singleton;

public final class BBSales_HiltComponents {
  private BBSales_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          AppModule.class,
          ApplicationContextModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements BBSales_GeneratedInjector,
      FragmentGetContextFix.FragmentGetContextFixEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          ChatViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          LoginViewModel_HiltModules.KeyModule.class,
          MainViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements MainActivity_GeneratedInjector,
      LoginSignupActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ChatViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          LoginViewModel_HiltModules.BindsModule.class,
          MainViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements TargetVsSalesFragment_GeneratedInjector,
      ChangePasswordLogin_GeneratedInjector,
      CustomersListFragment_GeneratedInjector,
      AddFollowUpsFragment_GeneratedInjector,
      FollowUpListFragment_GeneratedInjector,
      HomeFragment_GeneratedInjector,
      AddCustomerFragment_GeneratedInjector,
      BasicDetailsFormFragment_GeneratedInjector,
      BusinessDetailsFormFragment_GeneratedInjector,
      EditCustomerFragment_GeneratedInjector,
      ChatFragment_GeneratedInjector,
      MessageListFragment_GeneratedInjector,
      NotificationListFragment_GeneratedInjector,
      NotificationsMessagesFragment_GeneratedInjector,
      OffersFragment_GeneratedInjector,
      ProductListFragment_GeneratedInjector,
      EditProfileFragment_GeneratedInjector,
      ProfileFragment_GeneratedInjector,
      RevenueFragment_GeneratedInjector,
      StatisticsFragment_GeneratedInjector,
      ChangePasswordFragment_GeneratedInjector,
      ForgotPasswordFragment_GeneratedInjector,
      LoginFragment_GeneratedInjector,
      OTPFragment_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
