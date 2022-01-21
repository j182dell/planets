package com.jonas.planets


import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.jonas.planets.databinding.*


private const val NUM_TABS = 8

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
        FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return P1Fragment()
            1 -> return P2Fragment()
            2 -> return P3Fragment()
            3 -> return P4Fragment()
            4 -> return P5Fragment()
            5 -> return P6Fragment()
            6 -> return P7Fragment()
        }
        return P8Fragment()
    }
}


class P1Fragment : Fragment() {
    private var _binding: FragmentP1Binding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentP1Binding.inflate(inflater, container, false)

        binding.imageViewP1.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this.context)
            alertDialog.apply {
                setTitle("Mercury")
                setMessage("The smallest planet in our solar system " +
                        "and nearest to the sun mercury is only slightly " +
                        "larger than earth's moon from the surface of " +
                        "mercury the sun would appear more than three times " +
                        "as large as it does when viewed from earth and the " +
                        "sunlight would be as much as seven times brighter " +
                        "despite its proximity to the sun mercury is not the " +
                        "hottest planet in our solar system that title belongs " +
                        "to nearby venus thanks to its dense atmosphere because " +
                        "of mercury's elliptical egg shaped orbit and sluggish " +
                        "rotation the sun appears to rise briefly set and rise again " +
                        "from some parts of the planets surface the same thing happens " +
                        "in reverse at sunset.")

            }.create().show()
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

class P2Fragment : Fragment() {
    private var _binding: FragmentP2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentP2Binding.inflate(inflater, container, false)

        binding.imageViewP2.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this.context)
            alertDialog.apply {
                setTitle("Venus")
                setMessage("Venus is the second planet from the Sun and is Earth’s closest " +
                        "planetary neighbor. It’s one of the four inner, terrestrial (or rocky) " +
                        "planets, and it’s often called Earth’s twin because it’s " +
                        "similar in size and density. These are not identical twins, " +
                        "however – there are radical differences between the two worlds.")

            }.create().show()
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

class P3Fragment : Fragment() {
    private var _binding: FragmentP3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentP3Binding.inflate(inflater, container, false)

        binding.imageViewP3.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this.context)
            alertDialog.apply {
                setTitle("Earth")
                setMessage("Our home planet is the third planet from the Sun, and the only " +
                        "place we know of so far that’s inhabited by living things. " +
                        "While Earth is only the fifth largest planet in the solar system, " +
                        "it is the only world in our solar system with liquid water on the " +
                        "surface. Just slightly larger than nearby Venus, Earth is the " +
                        "biggest of the four planets closest to the Sun, all of which " +
                        "are made of rock and metal.")

            }.create().show()
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

class P4Fragment : Fragment() {
    private var _binding: FragmentP4Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentP4Binding.inflate(inflater, container, false)

        binding.imageViewP4.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this.context)
            alertDialog.apply {
                setTitle("Mars")
                setMessage("Mars is the fourth planet from the Sun – a dusty, cold, " +
                        "desert world with a very thin atmosphere. Mars is also a dynamic " +
                        "planet with seasons, polar ice caps, canyons, extinct volcanoes, " +
                        "and evidence that it was even more active in the past. " +
                        "Mars is one of the most explored bodies in our solar " +
                        "system, and it's the only planet where we've sent rovers " +
                        "to roam the alien landscape.")

            }.create().show()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

class P5Fragment : Fragment() {
    private var _binding: FragmentP5Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentP5Binding.inflate(inflater, container, false)

        binding.imageViewP5.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this.context)
            alertDialog.apply {
                setTitle("Jupiter")
                setMessage("Jupiter has a long history of surprising scientists – all " +
                        "the way back to 1610 when Galileo Galilei found the first " +
                        "moons beyond Earth. That discovery changed the way we see " +
                        "the universe. Fifth in line from the Sun, Jupiter is, " +
                        "by far, the largest planet in the solar system – more " +
                        "than twice as massive as all the other planets combined.")

            }.create().show()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

class P6Fragment : Fragment() {
    private var _binding: FragmentP6Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentP6Binding.inflate(inflater, container, false)

        binding.imageViewP6.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this.context)
            alertDialog.apply {
                setTitle("Saturn")
                setMessage("Saturn is the sixth planet from the Sun and the second-largest " +
                        "planet in our solar system. Adorned with thousands of " +
                        "beautiful ringlets, Saturn is unique among the planets. " +
                        "It is not the only planet to have rings – made of chunks " +
                        "of ice and rock – but none are as spectacular or as complicated as Saturn's. " +
                        "Like fellow gas giant Jupiter, Saturn is a massive ball made mostly " +
                        "of hydrogen and helium.")

            }.create().show()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

class P7Fragment : Fragment() {
    private var _binding: FragmentP7Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentP7Binding.inflate(inflater, container, false)

        binding.imageViewP7.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this.context)
            alertDialog.apply {
                setTitle("Uranus")
                setMessage("Uranus is the seventh planet from the Sun, " +
                        "and has the third-largest diameter in our solar system. " +
                        "It was the first planet found with the aid of a telescope, " +
                        "Uranus was discovered in 1781 by astronomer William Herschel, " +
                        "although he originally thought it was either a comet or a star.")

            }.create().show()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

class P8Fragment : Fragment() {
    private var _binding: FragmentP8Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentP8Binding.inflate(inflater, container, false)

        binding.imageViewP8.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this.context)
            alertDialog.apply {
                setTitle("Neptune")
                setMessage("Dark, cold, and whipped by supersonic winds, ice giant " +
                        "Neptune is the eighth and most distant planet in our solar system. " +
                        "More than 30 times as far from the Sun as Earth, Neptune " +
                        "is the only planet in our solar system not visible to the " +
                        "naked eye and the first predicted by mathematics before its " +
                        "discovery. In 2011 Neptune completed its first 165-year orbit " +
                        "since its discovery in 1846.")

            }.create().show()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

